package com.eum.assignment.msaservicecoffeestatus.springboot.repository;

import com.eum.assignment.msaservicecoffeestatus.springboot.repository.dvo.OrderStatusDVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ICoffeeStatusMapper {
    int insertCoffeeOrderStatus(OrderStatusDVO orderStatusDVO);
    OrderStatusDVO selectCoffeeOrderStatus();
    int createStatusTable();
}
