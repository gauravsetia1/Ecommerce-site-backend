package com.casestudy.ecart.repository;

import com.casestudy.ecart.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsersRepositoryClass {
    @Autowired
    UsersRegister usersRegister;

    public void add(Users users) {
        System.out.println("Adding a value");
        usersRegister.save(users);
    }

    public Optional<Users> getByEmail(String email) {
        System.out.println("Getting by email");
        return usersRegister.findByEmail(email);
    }

    public Optional<Users> getById(Integer id) {
        return usersRegister.findById(id);
    }
}
