package com.synacy.messages;

import com.synacy.sending.MessageSendFailedException;
import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class FaxMessage implements Message{

	Long duration;
	String sendTo;
	byte[] image;

	MessageSender messageSender = new MessageSender();

	public FaxMessage(String sendTo, byte[] image) {
		this.sendTo = sendTo;
		this.image = image;
		this.duration = duration;
	}
	@Override
	public BigDecimal calculateCost() {
		System.out.println("");
		return null;
	}
	@Override
	public void send() throws MessageSendFailedException { messageSender.sendFaxMessage(this);}

}
