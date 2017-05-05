package com.synacy.charging;

import com.synacy.message.FaxMessage;
import com.synacy.message.SmsMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	/**
	 * Assume this will be the messages that has to be sent and charged
	 */
	public static List<Object> generateMessages() {
		return new ArrayList<Object>(Arrays.asList(new FaxMessage("631111111", "some fax message".getBytes()),
				new FaxMessage("632222222", "some fax message".getBytes()),
				new SmsMessage("633333333", "sms message"),
				new SmsMessage("634444444", "sms message"),
				new FaxMessage("63555555", "some fax message".getBytes())));
	}

	/**
	 * Main goal here is to be able to charge messages. Problem is, we if statements to determine which is which.
	 * If we add in more types of messages in the future, this will get very long.
	 * How do we make it so, that there will be no more if statements.
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
