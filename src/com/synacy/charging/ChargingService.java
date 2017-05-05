package com.synacy.charging;

import com.synacy.Message;

import java.math.BigDecimal;

public class ChargingService {

    public void chargeMessage(Message message) {

        BigDecimal cost = message.calculateCost();
        charge(cost);
    }

	private void charge(BigDecimal bigDecimal) {
		System.out.println("Charging...");
		//charging logic...
	}

}
