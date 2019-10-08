package com.synacy;

import com.synacy.compress.ImageType;
import com.synacy.compress.MessageCompressor;

import java.math.BigDecimal;
import java.util.Random;

public class FaxMessage extends MessageCompressor {

	long duration;
	String sendTo;
	byte[] image;
	ImageType imageType;

	public FaxMessage(String sendTo, byte[] image, ImageType imageType, long duration) {
		this.duration = duration;
		this.sendTo = sendTo;
		this.image = image;
		this.imageType = imageType;
	}

	public BigDecimal calculateCost() {
		System.out.println("calculating cost based on duration and image size...");
		return BigDecimal.valueOf(new Random().nextDouble());
	}

	public String getDestination() {
		return sendTo;
	}

	public String generateCompressedMessage() {
		return compressFaxMessage(image, imageType);
	}

}
