package com.yxj.wechat;

import com.yxj.wechat.controller.HelloWorldController;
import com.yxj.wechat.entity.User;
import com.yxj.wechat.mapper.UserMapper;
import com.yxj.wechat.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WechatApplicationTests {





//	private UserMapper userMapper;

//	@Autowired
//	private UserService userServiceImpl;

//	private MockMvc mvc;
//
//	public void setUp() {
//		mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
//	}

	@Autowired
	private UserMapper userMapper;
	@Test
	public void contextLoads() throws Exception {
//		userMapper.insert("aa","cc");
		List<User> userList = userMapper.getAllUsers();
		System.out.println(userList.size()+"-----------------------------");
		System.out.println("asdada---------------------------------");
//		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//			.andExpect()
//		userServiceImpl.insert("yxj","yxj");

	}

}
