package com.synacy;

import java.math.BigDecimal;

public class Message implements Sendable, Chargable {

    public void send() { }

    public BigDecimal calculateCost() {
        return null;
    }
}
