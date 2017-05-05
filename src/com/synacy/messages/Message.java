package com.synacy.messages;

import com.synacy.sending.MessageSendFailedException;

import java.math.BigDecimal;

/**
 * Created by steven on 5/5/17.
 */
public interface Message{
    public BigDecimal calculateCost();
    public void send()throws MessageSendFailedException;
}
