package com.eum.assignment.msaservicecoffeeorder.springboot.service;

import com.eum.assignment.msaservicecoffeeorder.domain.model.CoffeeOrderCVO;
import com.eum.assignment.msaservicecoffeeorder.domain.repository.ICoffeeOrderRepository;
import com.eum.assignment.msaservicecoffeeorder.domain.service.CoffeeOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoffeeOrderServiceImpl extends CoffeeOrder {
    public CoffeeOrderServiceImpl(ICoffeeOrderRepository iCoffeeOrderRepository) {
        super(iCoffeeOrderRepository);
    }

}
