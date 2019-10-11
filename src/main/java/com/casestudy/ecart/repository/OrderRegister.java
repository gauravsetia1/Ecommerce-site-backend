package com.casestudy.ecart.repository;

import com.casestudy.ecart.model.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRegister extends JpaRepository<OrderHistory, Long> {

    List<OrderHistory> findAllByUserId(Long id);
}
