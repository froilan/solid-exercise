package com.synacy;

import com.synacy.sending.MessageSendFailedException;
import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class FaxMessage implements Message {

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
		System.out.println("");
		return null;
	}

	@Override
	public void send() throws MessageSendFailedException {
		MessageSender messageSender = new MessageSender();

		if(sendTo.isEmpty() || image == null) {
			throw new MessageSendFailedException("fax message send failed.");
		}

		messageSender.sendFaxMessage(this);
	}

}
