package com.yxj.wechat.service.impl;

import com.yxj.wechat.mapper.UserMapper;
import com.yxj.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserMapper userMapper;

    @Transactional
    @Override
    public void insert(String username, String password) {
        System.out.print("asda-------------------");
//        userMapper.insert(username,password);
    }
}


