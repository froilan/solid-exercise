package com.synacy;

import com.synacy.compress.MessageCompressor;

import java.math.BigDecimal;
import java.util.Random;

public class SmsMessage extends MessageCompressor {

	long parts;
	String sendTo;
	String content;

	public SmsMessage(String sendTo, String content) {
		this.content = content;
		this.sendTo = sendTo;
	}

	public BigDecimal calculateCost() {
		System.out.println("calculating sms cost based part count");
		return BigDecimal.valueOf(new Random().nextDouble());
	}

	public String getDestination() {
		return sendTo;
	}

	public String generateCompressedMessage() {
		return compressSmsMessage(content);
	}

}
