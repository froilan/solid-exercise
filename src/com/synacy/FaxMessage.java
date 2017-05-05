package com.synacy;

import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class FaxMessage implements Message {

	MessageSender sender;
	Long duration;
	String sendTo;
	byte[] image;

	public FaxMessage(String sendTo, byte[] image) {
		sender = new MessageSender();
		this.duration = duration;
		this.sendTo = sendTo;
		this.image = image;
	}

	public BigDecimal calculateCost() {
		System.out.println("");
		return null;
	}

	public void send() {
		sender.sendFaxMessage(this);
	}

}
