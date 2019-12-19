package com.yinhe.service;

import java.util.List;

import com.yinhe.bean.User;

public interface UserService {
    
    public void insert(User user);


    public User find(int id);
  
    public void delete(int id);

	public void update(User user);

	public List<User> userlist();

}
