package com.yinhe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;
import com.yinhe.bean.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class testJdbc {

	
 	@Resource    // 自动注入，spring boot会帮我们实例化一个对象
    private JdbcTemplate jdbcTemplate;   // 一个通过JDBC连接数据库的工具类，可以通过这个工具类对数据库进行增删改查

    @Test
    public void mySqlTest(){
        String sql = "select id,username,password,age from user";
        List<User> user = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user=new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setAge(resultSet.getInt("age"));
                return user;
            }
        });
        System.out.println("查询成功");
        for(User s : user){
            System.out.println(s);
        }
    }

    @Test
    public void mySqlTest2(){
    	String sql="INSERT INTO USER VALUES(?, ?, ?, ?)";
    	jdbcTemplate.update(sql, "1", "admin","128",68);
    }
    
    
    @Test
    public void mySqlTest3(){
    	String sql="update user set username = ? WHERE id =?";
    	jdbcTemplate.update(sql, "sqll", 6);
    }
    
    @Test
    public void mySqlTest4(){
    	String sql = "delete from user where id=?";
    	jdbcTemplate.update(sql, "1");
    }
    
    
}
