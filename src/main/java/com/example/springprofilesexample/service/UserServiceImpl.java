package com.example.springprofilesexample.service;

import com.example.springprofilesexample.entity.User;
import com.example.springprofilesexample.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User insertUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(Integer id ,User user) {
        User originalUser  = userRepo.findById(id).get();
        originalUser.setName(user.getName());
        originalUser.setAge(user.getAge());

        return userRepo.save(originalUser);
    }

    public String deleteUser(Integer id ) {

         userRepo.deleteById(id);
         return "User with id "+id+"is deleted from db";
    }
}
