package com.eum.assignment.msaservicecoffeeorder.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderEntity {
    private Long id;
    private String orderNumber;
    private String coffeeName;
    private String coffeeCount;
    private String customerName;
}
