package com.yinhe;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yinhe.bean.User;
import com.yinhe.mapper.UserMapper;
import com.yinhe.service.UserService;
@RunWith(SpringRunner.class)
@MapperScan(basePackages= {"com.yinhe.mapper"})
@SpringBootTest(classes={HelloWordApplication.class})
public class mybatistest {

	@Resource
	private UserMapper userMapper;

	 @Test
	 public void myTest(){
		List<User> list= userMapper.selectByExample(null);
		for (User user : list) {
			System.out.println(list);
		}

		
	}
	
	
}
