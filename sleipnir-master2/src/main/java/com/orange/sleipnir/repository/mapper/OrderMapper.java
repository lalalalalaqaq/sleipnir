package com.orange.sleipnir.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.orange.sleipnir.repository.entity.Order;

@Mapper
public interface OrderMapper {

    @Select("SELECT * FROM t_order WHERE user_id = #{userId} and account_id = #{accountId}")
    List<Order> selectUserIdAndAccountId(@Param("userId") Integer userId, @Param("accountId") Integer accountId);

    @Select("SELECT * FROM t_order WHERE order_id = #{orderId}")
    Order selectByOrderId(@Param("orderId") Long orderId);

    @Insert("INSERT INTO t_order (account_id, user_id) VALUES (#{accountId}, #{userId})")
    void insert(Order order);

    @Update("UPDATE t_order SET account_id = #{accountId}, user_id = #{userId} WHERE order_id = #{orderId}")
    void update(Order order);
}
