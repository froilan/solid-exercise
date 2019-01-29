package com.synacy;

import java.math.BigDecimal;

public class SmsMessage implements Sendable{
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
	public void send() {
		msgSender.sendSmsMessage(this);
	}
}

