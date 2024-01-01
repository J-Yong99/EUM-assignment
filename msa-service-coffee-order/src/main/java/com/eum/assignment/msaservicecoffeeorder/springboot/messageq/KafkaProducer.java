package com.eum.assignment.msaservicecoffeeorder.springboot.messageq;

import com.eum.assignment.msaservicecoffeeorder.domain.model.CoffeeOrderCVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, CoffeeOrderCVO payload) {
        log.info("sending payload='{}' to topic='{}'", payload, topic);
        // payload를 String으로 변환하여 전송
        kafkaTemplate.send(topic, payload.toString());
    }

}
