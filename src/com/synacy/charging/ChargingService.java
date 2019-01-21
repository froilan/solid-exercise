package com.synacy.charging;

import com.synacy.FaxMessage;
import com.synacy.SmsMessage;

import java.math.BigDecimal;

/**
 * Created by froilan on 5/5/17.
 */
public class ChargingService {

	public void chargeMessage(Message message) {
		message.calculateCost();
	}

	private void chargeMessage(BigDecimal bigDecimal) {
		System.out.println("Charging...");
		//charging logic...
	}

}
