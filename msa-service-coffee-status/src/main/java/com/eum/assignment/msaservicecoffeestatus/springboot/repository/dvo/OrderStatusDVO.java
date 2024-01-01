package com.eum.assignment.msaservicecoffeestatus.springboot.repository.dvo;

import lombok.Data;

@Data
public class OrderStatusDVO {
    private Long id;
    private String orderStatus;
    private String orderHistory;
}
