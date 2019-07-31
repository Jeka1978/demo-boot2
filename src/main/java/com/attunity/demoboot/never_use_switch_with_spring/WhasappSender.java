package com.attunity.demoboot.never_use_switch_with_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WhasappSender implements MessageSender {
    @Override
    public void send(Message message) {
        //50 lines of code
        System.out.println(message.getText()+" was sent by whatsapp *********");
    }

    @Override
    public String getMyCode() {
        return "002";
    }
}
