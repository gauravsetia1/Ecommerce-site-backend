package com.casestudy.ecart.controller;

import com.casestudy.ecart.model.Users;
import com.casestudy.ecart.repository.UsersRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class UsersController {

    @Autowired
    UsersRegister usersRegister;

    @PostMapping("/addUsers")
    public Users addUsers(@Valid @RequestBody Users users) {
        return usersRegister.save(users);
    }

    @GetMapping("/getUsers")
    public List<Users> getUsers() {
        return usersRegister.findAll();
    }

    @GetMapping("/validuser")
    public String valUser()
    {
        return "\"user successfully authenticated\"";
    }

}
