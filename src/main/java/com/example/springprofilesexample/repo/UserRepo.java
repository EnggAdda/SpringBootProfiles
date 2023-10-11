package com.example.springprofilesexample.repo;

import com.example.springprofilesexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
