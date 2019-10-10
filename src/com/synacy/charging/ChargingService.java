package com.synacy.charging;

import com.synacy.Chargeable;

import java.math.BigDecimal;

/**
 * Created by froilan on 5/5/17.
 */
public class ChargingService {

	public void chargeMessage(Chargeable message) {
		BigDecimal cost = message.calculateCost();
		printChargeMessage(cost);
	}

	private void printChargeMessage(BigDecimal bigDecimal) {
		System.out.println("Charging...");
		//charging logic...
	}

}
