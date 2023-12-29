package com.eum.assignment.msaservicecoffeestatus.springboot.repository.dvo;

import lombok.Data;

@Data
public class OrderStatusDVO {
    private int id;
    private String orderStatus;
    private String orderHistory;
}
