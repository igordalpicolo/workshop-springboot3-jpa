package com.projetospbt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospbt.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
