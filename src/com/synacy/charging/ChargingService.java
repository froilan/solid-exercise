package com.synacy.charging;

import java.math.BigDecimal;

/**
 * Created by froilan on 5/5/17.
 */
public class ChargingService {

	public void chargeMessage(CostHandler message){
		BigDecimal cost = message.calculateCost();
		chargeMessage(cost);
	}

//	public void chargeFaxMessage(FaxMessage faxMessage) {
//		BigDecimal cost = messageHandler.calculateCost();
//		chargeMessage(cost);
//	}
//
//	public void chargeSmsMessage(SmsMessage smsMessage) {
//		BigDecimal cost = messageHandler.calculateCost();
//		chargeMessage(cost);
//	}

	private void chargeMessage(BigDecimal bigDecimal) {
		System.out.println("Charging...");
		//charging logic...
	}
}
