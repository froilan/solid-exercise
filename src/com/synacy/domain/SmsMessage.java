package com.synacy.domain;

import java.math.BigDecimal;

public class SmsMessage extends Message<String> {

	public SmsMessage(String sendTo, String content) {
		super(sendTo, content);
	}

	@Override
	public BigDecimal calculateCost() {
		System.out.println("calculating cost for sms message");

		return new BigDecimal(1.0);
	}

	@Override
	public String toString() {
		return "a sms message";
	}

	/*
	Long pages;
	String sendTo;
	String content;

	public SmsMessage(String sendTo, String content) {
		this.content = content;
		this.sendTo = sendTo;
	}

	public BigDecimal calculateCost() {
		System.out.println("calculating cost for sms message");
		return null;
	}

	public void send() {
		this.sendSmsMessage(this);
	}
	*/
}
