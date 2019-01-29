package com.synacy;

import java.math.BigDecimal;

public class FaxMessage extends Message{

	Long duration;
	String sendTo;
	byte[] image;

	public FaxMessage(String sendTo, byte[] image) {
		this.duration = duration;
		this.sendTo = sendTo;
		this.image = image;
	}

	@Override
	public BigDecimal calculateCost() {
		System.out.println("Calculating Cost for Fax Message");
		return null;
	}

	@Override
	public void send() {
		msgSender.sendFaxMessage(this);
	}
}
