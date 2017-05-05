package com.synacy;

import com.synacy.charging.CostHandler;
import com.synacy.genericsending.TypeHandler;
import com.synacy.sending.MessageSender;

import java.math.BigDecimal;

public class FaxMessage implements CostHandler, TypeHandler{

	MessageSender messageSender;
	Long duration;
	String sendTo;
	byte[] image;

	public FaxMessage(String sendTo, byte[] image) {
		messageSender = new MessageSender();
		this.duration = duration;
		this.sendTo = sendTo;
		this.image = image;
	}

	public BigDecimal calculateCost() {
		System.out.println("");
		return null;
	}

	public void send() {
		messageSender.sendFaxMessage(this);
	}

}
