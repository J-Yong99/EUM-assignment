package com.eum.assignment.msaservicecoffeemember.springboot.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ICoffeeMemberJpaRepository extends JpaRepository<Member, Long> {
    Member findByMemberName(String memberName);
    Boolean existsByMemberName(String memberName);

}
