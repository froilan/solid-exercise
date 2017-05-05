package com.synacy.messages;

import com.synacy.sending.MessageSendFailedException;
import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class SmsMessage implements Message {

	Long pages;
	String sendTo;
	String content;

	MessageSender messageSender = new MessageSender();

	public SmsMessage(String sendTo, String content) {
		this.sendTo = sendTo;
		this.content = content;
		this.pages = pages;
	}
	@Override
	public BigDecimal calculateCost() {
		System.out.println("calculating cost for sms message");
		return null;
	}
	@Override
	public void send() throws MessageSendFailedException{messageSender.sendSmsMessage(this);}


}
