package com.synacy;

import com.synacy.sending.MessageSendFailedException;

import java.math.BigDecimal;

public interface Message {

    void send() throws MessageSendFailedException;

    BigDecimal calculateCost();
}
