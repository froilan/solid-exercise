package com.synacy.charging;

import com.synacy.FaxMessage;
import com.synacy.SmsMessage;
import com.synacy.compress.ImageType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	/**
	 * Assume this will be the messages that has to be charged
	 */
	public static List<Object> generateMessages() {
		return List.of(new FaxMessage("631111111", "some jpeg image".getBytes(), ImageType.JPEG, 100),
				new FaxMessage("632222222", "some tiff image".getBytes(), ImageType.TIFF, 100),
				new SmsMessage("633333333", "sms message"),
				new SmsMessage("634444444", "sms message"),
				new FaxMessage("63555555", "some png image".getBytes(), ImageType.PNG, 100));
	}

	/**
	 * Main goal here is to be able to charge messages. Problem is, we if statements to determine which is which.
	 * If we add in more types of messages in the future, this will get very long.
	 * What can we do to make the ChargingService accept different type of messages without the need of using if conditional statements.
	 * */
	public static void main(String args[]) {

		List<Object> messages = generateMessages();

		ChargingService chargingService = new ChargingService();
		messages.forEach((message) -> {
			if (message instanceof FaxMessage) {
				chargingService.chargeFaxMessage((FaxMessage) message);
			} else if (message instanceof SmsMessage) {
				chargingService.chargeSmsMessage((SmsMessage) message);
			}
		});
	}

}
