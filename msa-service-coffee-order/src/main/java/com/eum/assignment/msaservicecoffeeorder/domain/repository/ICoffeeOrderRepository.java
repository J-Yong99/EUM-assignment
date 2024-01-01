package com.eum.assignment.msaservicecoffeeorder.domain.repository;

import com.eum.assignment.msaservicecoffeeorder.domain.model.OrderEntity;

public interface ICoffeeOrderRepository {
    public Long coffeeOrderSave(OrderEntity orderEntity);
}
