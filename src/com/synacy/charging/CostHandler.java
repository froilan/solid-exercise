package com.synacy.charging;

import com.synacy.FaxMessage;
import com.synacy.SmsMessage;

import java.math.BigDecimal;

/**
 * Created by kenichigouang on 5/5/17.
 */
public interface CostHandler {
    BigDecimal calculateCost();
}
