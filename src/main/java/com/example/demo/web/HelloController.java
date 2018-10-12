
package com.example.demo.web;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/u")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userMapper.getAll();
		return users;
	}

}