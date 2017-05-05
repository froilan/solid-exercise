package com.synacy.charging;

import com.synacy.Message;

import java.math.BigDecimal;

/**
 * Created by froilan on 5/5/17.
 */
public class ChargingService {

	public void chargeMessage(Message message) {
		BigDecimal cost = message.calculateCost();
		chargeMessage(cost);
	}


	private void chargeMessage(BigDecimal bigDecimal) {
		System.out.println("Charging...");
		//charging logic...
	}

}
