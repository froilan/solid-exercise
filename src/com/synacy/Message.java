package com.synacy;

import java.math.BigDecimal;

public interface Message {

    void send();

    BigDecimal calculateCost();
}
