package com.synacy.messages;

import java.math.BigDecimal;

/**
 * Created by steven on 5/5/17.
 */
public interface Message{
    public BigDecimal calculateCost();
    public void send();
}
