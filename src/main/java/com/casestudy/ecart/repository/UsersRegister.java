package com.casestudy.ecart.repository;

import com.casestudy.ecart.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRegister extends JpaRepository<Users, Integer> {
}
