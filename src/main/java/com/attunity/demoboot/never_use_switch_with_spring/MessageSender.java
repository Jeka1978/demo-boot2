package com.attunity.demoboot.never_use_switch_with_spring;

/**
 * @author Evgeny Borisov
 */
public interface MessageSender {
    void send(Message message);

    String getMyCode();
}
