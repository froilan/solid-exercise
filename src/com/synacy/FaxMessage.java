package com.synacy;

import com.synacy.compress.ImageType;
import com.synacy.compress.MessageCompressor;

import java.math.BigDecimal;
import java.util.Random;

public class FaxMessage implements Chargeable, Sendable, Compressible {

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

	@Override
	public String generateCompressedMessage() {
		return new MessageCompressor().compressFaxMessage(image, imageType);
	}

	@Override
	public BigDecimal calculateCost() {
		System.out.println("calculating fax cost based on duration and image size...");
		return BigDecimal.valueOf(new Random().nextDouble());
	}

	@Override
	public String getDestination() {
		return sendTo;
	}

}
