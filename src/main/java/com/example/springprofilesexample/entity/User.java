package com.example.springprofilesexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name= "userTable")
@Entity
public class User {
    @Id
    private Integer id ;
    private String name ;
    private Integer age ;
}
