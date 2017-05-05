package com.synacy;

import com.synacy.sending.MessageSendFailedException;

import java.math.BigDecimal;

/**
 * Created by banjoe on 5/5/17.
 */
public interface Message {
    BigDecimal calculateCost();
    void send() throws MessageSendFailedException;
}
