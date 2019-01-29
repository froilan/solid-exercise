package com.synacy;

import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class FaxMessage implements Sendable, Chargeable{

	Long duration;
	String sendTo;
	byte[] image;

	private MessageSender msgSender = new MessageSender();

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
