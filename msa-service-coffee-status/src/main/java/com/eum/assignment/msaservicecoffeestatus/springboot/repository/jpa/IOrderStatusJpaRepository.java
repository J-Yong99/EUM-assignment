package com.eum.assignment.msaservicecoffeestatus.springboot.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderStatusJpaRepository extends JpaRepository<OrderStatus, Long> {
}
