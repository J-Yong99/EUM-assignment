package com.eum.assignment.msaservicecoffeeorder.springboot.messageq;

import com.eum.assignment.msaservicecoffeeorder.domain.model.CoffeeOrderCVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String, CoffeeOrderCVO> kafkaTemplate;

    public void send(String topic, CoffeeOrderCVO payload) {
        log.info("sending payload='{}' to topic='{}'", payload, topic);
        kafkaTemplate.send(topic, payload);
    }

}
