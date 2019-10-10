package com.synacy;

import com.synacy.compress.MessageCompressor;

import java.math.BigDecimal;
import java.util.Random;

public class SmsMessage implements Chargeable, Sendable, Compressible {

	long parts;
	String sendTo;
	String content;

	public SmsMessage(String sendTo, String content) {
		this.content = content;
		this.sendTo = sendTo;
	}

	@Override
	public String generateCompressedMessage() {
		return new MessageCompressor().compressSmsMessage(content);
	}

	@Override
	public BigDecimal calculateCost() {
		System.out.println("calculating sms cost based part count");
		return BigDecimal.valueOf(new Random().nextDouble());
	}

	@Override
	public String getDestination() {
		return sendTo;
	}

}
