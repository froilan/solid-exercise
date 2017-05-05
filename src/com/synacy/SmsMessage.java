package com.synacy;

import com.synacy.charging.CostHandler;
import com.synacy.genericsending.TypeHandler;
import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class SmsMessage implements CostHandler, TypeHandler {

	MessageSender messageSender;
	Long pages;
	String sendTo;
	String content;

	public SmsMessage(String sendTo, String content) {
		messageSender = new MessageSender();
		this.content = content;
		this.sendTo = sendTo;
	}

	public BigDecimal calculateCost() {
		System.out.println("calculating cost for sms message");
		return null;
	}

	public void send() {
		messageSender.sendSmsMessage(this);
	}

}
