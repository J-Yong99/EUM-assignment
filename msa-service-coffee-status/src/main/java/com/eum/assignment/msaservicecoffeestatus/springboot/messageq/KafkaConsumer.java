package com.eum.assignment.msaservicecoffeestatus.springboot.messageq;

import com.eum.assignment.msaservicecoffeestatus.springboot.repository.dvo.OrderStatusDVO;
import com.eum.assignment.msaservicecoffeestatus.springboot.repository.jpa.IOrderStatusJpaRepository;
import com.eum.assignment.msaservicecoffeestatus.springboot.repository.jpa.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @Autowired
    private IOrderStatusJpaRepository insertCoffeeOrderStatus;

    @KafkaListener(topics = "kafka-test", groupId = "test-group")
    public void processMessage(String kafkaMessage) {
        System.out.println("kafkaMessage: " + kafkaMessage);
        OrderStatus orderStatus = OrderStatus.builder().orderStatus("ORDERED").orderHistory(kafkaMessage).build();

        insertCoffeeOrderStatus.save(orderStatus);
    }
}
