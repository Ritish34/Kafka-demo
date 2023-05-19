package com.example.kafka.controller;

import com.example.kafka.service.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka/")
public class KafkaController {

    Logger log = LoggerFactory.getLogger(KafkaController.class);

    private KafkaProducer producer;

    public KafkaController(KafkaProducer producer){
        this.producer = producer;
    }

    @RequestMapping("publish")
    public String sendMessage(@RequestParam("message") String message){
        producer.sendMessage(message);
        return "message sent....";
    }
}
