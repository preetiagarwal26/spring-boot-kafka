package com.kafka.consumer;

import com.kafka.dto.MessagePayload;
import com.kafka.utils.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer.class);

    @KafkaListener(topics = AppConstants.TOPIC_NAME,
            groupId = AppConstants.GROUP_ID)
    public void consume(MessagePayload message) {
        LOGGER.info(String.format("Message received -> %s", message.toString()));
    }
}
