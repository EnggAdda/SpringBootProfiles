package com.example.springprofilesexample.controller;

import com.example.springprofilesexample.entity.User;
import com.example.springprofilesexample.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServiceImpl userService;
@Autowired
    private Environment environment;

@Value("${spring.profiles.active}")
private String activeProfile;
    @GetMapping("/users")
    List<User> getAllUsers(){
     return userService.getAllUsers();
    }
    @PostMapping("/insert")
    User insertUser(@RequestBody User user    ){
        return userService.insertUser(user);
    }
    @PutMapping("/update/{id}")
    User updateUser(@PathVariable Integer id ,@RequestBody User user ){
        return userService.updateUser(id, user);
    }
    @DeleteMapping("/delete/{id}")
    String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }

    @GetMapping("/get")
    public void get(){
        String [] env  = environment.getActiveProfiles();
        for(String env1 : env){
            System.out.println(env1);
        }

        System.out.println("activeProfile is "+ activeProfile);

    }
}
