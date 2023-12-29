package com.eum.assignment.msaservicecoffeeorder.springboot.repository;

import com.eum.assignment.msaservicecoffeeorder.domain.model.OrderEntity;
import com.eum.assignment.msaservicecoffeeorder.domain.repository.ICoffeeOrderRepository;
import com.eum.assignment.msaservicecoffeeorder.springboot.repository.jpa.ICoffeeOrderJpaRepository;
import com.eum.assignment.msaservicecoffeeorder.springboot.repository.jpa.OrderEntityJPO;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeOrderRepository implements ICoffeeOrderRepository {
    private ICoffeeOrderJpaRepository iCoffeeOrderJpaRepository;

    public CoffeeOrderRepository(ICoffeeOrderJpaRepository iCoffeeOrderRepository) {
        this.iCoffeeOrderJpaRepository = iCoffeeOrderRepository;
    }

    @Override
    public String coffeeOrderSave(OrderEntity orderEntity) {
        OrderEntityJPO orderEntityJPO = OrderEntityJPO.builder()
                .orderNumber(orderEntity.getOrderNumber())
                .coffeeName(orderEntity.getCoffeeName())
                .coffeeCount(orderEntity.getCoffeeCount())
                .customerName(orderEntity.getCustomerName())
                .build();

        iCoffeeOrderJpaRepository.save(orderEntityJPO);

        return orderEntityJPO.getId();
    }
}
