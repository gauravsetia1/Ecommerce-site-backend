package com.casestudy.ecart.repository;

import com.casestudy.ecart.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRegister extends JpaRepository<Items, Integer> {

}
