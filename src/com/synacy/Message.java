package com.synacy;

import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class Message {

    protected MessageSender msgSender = new MessageSender();

    public void send() {
        msgSender.sendStringMessage("Sending message");
    }

    public BigDecimal calculateCost() {
        System.out.println("Calculating cost of message");

        return null;
    }

}
