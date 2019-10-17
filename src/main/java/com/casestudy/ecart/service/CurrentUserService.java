package com.casestudy.ecart.service;

import com.casestudy.ecart.model.Items;
import com.casestudy.ecart.model.Users;
import com.casestudy.ecart.repository.ItemsRegister;
import com.casestudy.ecart.repository.UsersRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Optional;

@Service
public class CurrentUserService {

    @Autowired
    UsersRegister usersRegister;

    public Users getUser(Principal principal) {
        Optional<Users> users = usersRegister.findByEmail(principal.getName());
        return users.get();
    }

}
