package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * this is configuration class which make sure when we run
 * program we have topic created
 * if topic is already created than application ignore this.
* */

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("spring-topic")
                .build();
    }
}
