package com.synacy.domain;

import java.math.BigDecimal;

public class FaxMessage extends Message<byte[]> {

	public FaxMessage(String sendTo, byte[] content) {
		super(sendTo, content);
	}

	@Override
	public BigDecimal calculateCost() {
		System.out.println("calculating cost for fax message");

		return new BigDecimal(5.5);
	}

	@Override
	public String toString() {
		return "a fax message";
	}


	/*
	Long duration;
	String sendTo;
	byte[] image;

	public FaxMessage(String sendTo, byte[] image) {
		this.duration = duration;
		this.sendTo = sendTo;
		this.image = image;
	}

	public BigDecimal calculateCost() {
		System.out.println("");
		return null;
	}

	public void send() {
		this.sendFaxMessage(this);
	}
	*/
}
