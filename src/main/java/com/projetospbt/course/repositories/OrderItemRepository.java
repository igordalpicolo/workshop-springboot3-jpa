package com.projetospbt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospbt.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
