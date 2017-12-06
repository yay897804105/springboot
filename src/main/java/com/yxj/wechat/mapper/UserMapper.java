package com.yxj.wechat.mapper;

import com.yxj.wechat.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Configuration;

import java.util.List;


public interface UserMapper {

    public int insertUser(User user);

    public List<User> getAllUsers();
}
