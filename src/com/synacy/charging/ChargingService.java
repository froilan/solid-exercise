package com.synacy.charging;

import com.synacy.message.FaxMessage;
import com.synacy.message.SmsMessage;

import java.math.BigDecimal;

/**
 * Created by froilan on 5/5/17.
 */
public class ChargingService {

	public void chargeFaxMessage(FaxMessage faxMessage) {
		BigDecimal cost = faxMessage.calculateCost();
		chargeMessage(cost);
	}

	public void chargeSmsMessage(SmsMessage smsMessage) {
		BigDecimal cost = smsMessage.calculateCost();
		chargeMessage(cost);
	}

	private void chargeMessage(BigDecimal bigDecimal) {
		System.out.println("Charging...");
		//charging logic...
	}

}
