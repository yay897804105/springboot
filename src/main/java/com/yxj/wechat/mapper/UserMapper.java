package com.yxj.wechat.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Configuration;

@Mapper
public interface UserMapper {

    @Insert("insert users(username,password) values(#{username},#{password})")
    public int insert(@Param("username") String username, @Param("password") String password);
}
