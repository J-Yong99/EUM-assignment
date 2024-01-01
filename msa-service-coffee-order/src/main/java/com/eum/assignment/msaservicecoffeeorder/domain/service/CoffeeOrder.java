package com.eum.assignment.msaservicecoffeeorder.domain.service;

import com.eum.assignment.msaservicecoffeeorder.domain.model.CoffeeOrderCVO;
import com.eum.assignment.msaservicecoffeeorder.domain.model.OrderEntity;
import com.eum.assignment.msaservicecoffeeorder.domain.repository.ICoffeeOrderRepository;

public class CoffeeOrder implements ICoffeeOrder{
    private final ICoffeeOrderRepository iCoffeeOrderRepository;

    public CoffeeOrder(ICoffeeOrderRepository iCoffeeOrderRepository) {
        this.iCoffeeOrderRepository = iCoffeeOrderRepository;
    }

    @Override
    public Long coffeeOrder(CoffeeOrderCVO coffeeOrderCVO) {
        OrderEntity orderEntity = OrderEntity.builder()
                .orderNumber(coffeeOrderCVO.getOrderNumber())
                .coffeeName(coffeeOrderCVO.getCoffeeName())
                .coffeeCount(coffeeOrderCVO.getCoffeeCount())
                .customerName(coffeeOrderCVO.getCustomerName())
                .build();
        iCoffeeOrderRepository.coffeeOrderSave(orderEntity);

        return orderEntity.getId();
    }
}
