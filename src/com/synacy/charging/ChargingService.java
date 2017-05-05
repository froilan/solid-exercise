package com.synacy.charging;

import com.synacy.Message;

import java.math.BigDecimal;

public class ChargingService {

    public void chargeMessageSender(Message message) {

        BigDecimal cost = message.calculateCost();
        chargeMessage(cost);
    }

	private void chargeMessage(BigDecimal bigDecimal) {
		System.out.println("Charging...");
		//charging logic...
	}

}
