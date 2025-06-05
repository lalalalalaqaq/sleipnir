package com.orange.sleipnir.repository.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.orange.sleipnir.repository.model.Order;

@Mapper
public interface OrderMapper {

    @Insert("INSERT INTO torder (id, user_id, order_no, amount) VALUES (#{id}, #{userId}, #{orderNo}, #{amount})")
    public void insert(Order order);

    @Select("SELECT * FROM torder WHERE id = #{id}")
    public Order findById(Long id);

    @Select("SELECT * FROM torder WHERE order_no = #{orderNo}")
    public Order findByOrderNo(String orderNo);

    @Update("UPDATE torder SET user_id = #{userId}, order_no = #{orderNo}, amount = #{amount} WHERE id = #{id}")
    public void update(Order order);

    @Update("DELETE FROM torder WHERE id = #{id}")
    public void delete(Long id);

    @Update("DELETE FROM torder WHERE order_no = #{orderNo}")
    public void deleteByOrderNo(String orderNo);

}
