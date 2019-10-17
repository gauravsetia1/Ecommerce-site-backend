package com.casestudy.ecart.controller;

import com.casestudy.ecart.model.Users;
import com.casestudy.ecart.repository.UsersRegister;
import com.casestudy.ecart.service.CurrentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class UsersController {

    @Autowired
    UsersRegister usersRegister;

    @Autowired
    CurrentUserService currentUserService;

/*
    public static Principal principal;
*/

    @GetMapping(path = "/checkuser", produces = "application/json")
    public String checkLogin(Principal principal) {
        System.out.println("Logging in User.." + principal.getName());
        /*this.principal = principal;*/
        return "\"Login Successful\"";
    }

    @PostMapping("/addUsers")
    public Users addUsers(@Valid @RequestBody Users users) {
        users.setActive(1);
        users.setAuthorize("basic");
        usersRegister.save(users);
        return users;
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

    @GetMapping("/logUser")
    public Users logUser(Principal principal) {
        return currentUserService.getUser(principal);
    }

    @PutMapping("/update")
    public Users update(@Valid @RequestBody Users users) {
        users.setActive(1);
        users.setAuthorize(users.getAuthorize());
        usersRegister.save(users);
        return users;
    }

}
