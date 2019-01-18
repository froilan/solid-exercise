package com.synacy;

import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class SmsMessage extends MessageSender {

	Long pages;
	String sendTo;
	String content;
	private SmsSender smsSender = new SmsSender();

	public SmsMessage(String sendTo, String content) {
		this.content = content;
		this.sendTo = sendTo;
	}

	public BigDecimal calculateCost() {
		System.out.println("calculating cost for sms message");
		return null;
	}

	public void send() {
		smsSender.sendSmsMessage(this);
	}

	private class SmsSender {
		private MessageSender msgSender;

		public void sendSmsMessage(SmsMessage smsMessage) {
			msgSender.sendSmsMessage(smsMessage);
		}
	}

}
