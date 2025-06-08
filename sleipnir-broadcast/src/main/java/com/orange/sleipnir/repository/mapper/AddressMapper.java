package com.orange.sleipnir.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.orange.sleipnir.repository.entity.Address;

@Mapper
public interface AddressMapper {

    @Insert("INSERT INTO t_address (address_name, user_id) VALUES (#{addressName}, #{userId})")
    public void insert(Address address);

    @Insert("UPDATE t_address SET address_name = #{addressName}, user_id = #{userId} WHERE id = #{id}")
    public void update(Address address);

    
    @Select("SELECT * FROM t_address WHERE id = #{id}")
    public Address selectById(Long id);

    @Select("SELECT * FROM t_address WHERE user_id = #{userId}")
    public List<Address> selectByUserId(Long userId);

}
