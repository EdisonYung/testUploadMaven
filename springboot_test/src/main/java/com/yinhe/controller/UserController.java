package com.yinhe.controller;

import java.util.List;

import javax.annotation.Resource;



import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import com.yinhe.bean.User;
import com.yinhe.service.UserService;

@RestController
public class UserController {

	@Resource
    private UserService userService;
	
	
	@RequestMapping("/hell")
	public String hello() {
		return "hello world访问成功";
	}
	
    @RequestMapping("/list")
    public List<User> list(User user){
        return userService.userlist();
    }
 
    @RequestMapping("/find")
    public String getStuinforList(int id){
       User user =userService.find(id);
        System.out.println(user);
        return "哈哈";
    }
    
    @RequestMapping("/add")
    public String adduser(User user){
      userService.insert(user);
        return "";
    }
	
    @RequestMapping("/update")
    public String updateuser(User user){
      userService.update(user);
        return "";
    }
    
    
    @RequestMapping("/delete")
    public String deleteuser(int id){
      userService.delete(id);
        return "";
    }
    
    
    
	
}
