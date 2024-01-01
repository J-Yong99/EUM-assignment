package com.eum.assignment.msaservicecoffeeorder.springboot.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoffeeOrderJpaRepository extends JpaRepository<OrderEntityJPO, Long> {

}
