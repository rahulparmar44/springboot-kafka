package com.learnings.springbootkafka.kafka;

import com.learnings.springbootkafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "myTopic_json", groupId = "myGroup")
    public void consume(User user) {
        log.info(String.format("Json message received -> %s", user));
    }
}
