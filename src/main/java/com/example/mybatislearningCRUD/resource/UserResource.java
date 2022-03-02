package com.example.mybatislearningCRUD.resource;

import java.util.List;

import com.example.mybatislearningCRUD.mapper.UserMapper;
import com.example.mybatislearningCRUD.model.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UserMapper userMapper;

    public UserResource(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return userMapper.findAll();
    }
    
    @GetMapping("/update")
    private List<Users> update() {
        Users users = new Users();
        users.setName("Hawaii");
        users.setSalary(100000L);
        userMapper.insert(users);

        return userMapper.findAll();

    }

    @GetMapping("/updateUsers")
    private List<Users> updateUsers() {
        Users users = new Users();
        users.setName("Hawaii");
        users.setSalary(3333L);
        userMapper.update(users);

        return userMapper.findAll();
    }

    @GetMapping("/delete")
    private List<Users> delete() {
        Users users = new Users();
        users.setName("Hawaii");

        userMapper.delete(users);
        return userMapper.findAll();
    }

}
