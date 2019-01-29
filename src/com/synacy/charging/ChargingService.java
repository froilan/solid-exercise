package com.synacy.charging;

import com.synacy.Chargeable;

/**
 * Created by froilan on 5/5/17.
 */
public class ChargingService {

	public void chargeMessage(Chargeable message) {
		message.calculateCost();
	}

}
