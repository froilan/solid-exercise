package com.synacy.domain;

import java.math.BigDecimal;

/**
 * Created by michael on 5/5/17.
 */
public class StringMessage extends Message<String> {

    public StringMessage(String sendTo, String content) {
        super(sendTo, content);
    }

    @Override
    public BigDecimal calculateCost() {
        return null;
    }

    @Override
    public String toString() {
        return "a string message";
    }
}

