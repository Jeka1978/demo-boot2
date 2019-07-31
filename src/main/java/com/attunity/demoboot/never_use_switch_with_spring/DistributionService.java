package com.attunity.demoboot.never_use_switch_with_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
@Service
public class DistributionService {


    private Map<String,MessageSender> senderMap;

    @Autowired
    public DistributionService(List<MessageSender> senders) {
        senderMap = senders.stream().collect(Collectors.toMap(MessageSender::getMyCode, v -> v));


    }

    public void deliver(Message message) {
        String type = message.getType();
        MessageSender messageSender = senderMap.get(type);
        if (messageSender == null) {
            throw new IllegalStateException(type + " not supported yet");
        }
        messageSender.send(message);
    }
}





