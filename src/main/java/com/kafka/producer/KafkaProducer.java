package com.kafka.producer;

import com.kafka.dto.MessagePayload;
import com.kafka.utils.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, MessagePayload> kafkaTemplate;

    public void sendMessage(MessagePayload message){
        LOGGER.info(String.format("Message sent -> %s", message.toString()));
        kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }
}
