package com.synacy.services;

import com.synacy.domain.Message;

import java.math.BigDecimal;

/**
 * Created by froilan on 5/5/17.
 */
public class ChargingServiceImpl implements ChargingService {

	@Override
	public void chargeMessage(Message message) {
		BigDecimal messageCost = message.calculateCost();

		System.out.println("Charging... " + message.toString() + " : " + messageCost);
		//charging logic...
	}
}
