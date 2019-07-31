package com.attunity.demoboot.never_use_switch_with_spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class MessageDeliveryController {
    @Autowired
    private DistributionService service;

    @PostMapping("/send")
    public void sendMsg(@RequestBody Message message) {
        service.deliver(message);
    }







    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Message message = Message.builder().text("This is my first message").type("002").build();
        String json = mapper.writeValueAsString(message);
        System.out.println("json = " + json);
        Message message1 = mapper.readValue(json, Message.class);
        System.out.println(message1);
    }
}








