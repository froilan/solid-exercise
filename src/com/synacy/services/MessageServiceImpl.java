package com.synacy.services;

import com.synacy.domain.Message;

/**
 * This is a stable and well used class by other classes, so nothing should be changed here.
 */
public class MessageServiceImpl implements MessageService {
	private ChargingService chargingService;

	@Override
	public void send(Message message) throws MessageSendFailedException {
		System.out.println("sending " + message.toString());

		// sending message logic
		System.out.println("message sent");

		chargingService.chargeMessage(message);

		System.out.println("done...");
	}

	public ChargingService getChargingService() {
		return chargingService;
	}

	public void setChargingService(ChargingService chargingService) {
		this.chargingService = chargingService;
	}
}
