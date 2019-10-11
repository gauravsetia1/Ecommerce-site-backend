package com.casestudy.ecart.repository;

import com.casestudy.ecart.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRegister extends JpaRepository<Users, Integer> {

    public Optional<Users> findByEmail(String email);

}
