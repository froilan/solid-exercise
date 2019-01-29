package com.synacy.charging;

import com.synacy.Message;

/**
 * Created by froilan on 5/5/17.
 */
public class ChargingService {

	public void chargeMessage(Message message) {
		message.calculateCost();
	}

}
