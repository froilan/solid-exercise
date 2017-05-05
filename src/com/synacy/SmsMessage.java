package com.synacy;

import com.synacy.sending.MessageSendFailedException;
import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class SmsMessage implements Message {

	Long pages;
	String sendTo;
	String content;

	public SmsMessage(String sendTo, String content) {
		this.content = content;
		this.sendTo = sendTo;
	}

	@Override
	public BigDecimal calculateCost() {
		System.out.println("calculating cost for sms message");
		return null;
	}

	@Override
	public void send() throws MessageSendFailedException {
		MessageSender messageSender = new MessageSender();

		if(sendTo.isEmpty() && content.isEmpty()) {
			throw new MessageSendFailedException("sms message send failed.");
		}

		messageSender.sendSmsMessage(this);
	}

}
