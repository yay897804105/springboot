package com.yxj.wechat;

import com.yxj.wechat.controller.HelloWorldController;
import com.yxj.wechat.mapper.UserMapper;
import com.yxj.wechat.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WechatApplicationTests {



//	private UserMapper userMapper;

//	@Autowired
//	private UserService userServiceImpl;

	@Test
	public void contextLoads() throws Exception {
		System.out.print("asdada---------------------------------");

//		userServiceImpl.insert("yxj","yxj");

	}

}
