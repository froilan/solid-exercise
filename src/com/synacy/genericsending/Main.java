package com.synacy.genericsending;

import com.synacy.FaxMessage;
import com.synacy.SmsMessage;
import com.synacy.compress.ImageType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by froilan on 5/5/17.
 */
public class Main {

	/**
	 * Assume this will be the messages that has to be sent
	 */
	public static List<Object> generateMessages() {
		return List.of(new FaxMessage("631111111", "some jpeg image".getBytes(), ImageType.JPEG, 100),
				new FaxMessage("632222222", "some tiff image".getBytes(), ImageType.TIFF, 100),
				new SmsMessage("633333333", "sms message"),
				new SmsMessage("634444444", "sms message"),
				new FaxMessage("63555555", "some png image".getBytes(), ImageType.PNG, 100));
	}

	/**
	 * See GenericMessageSenderService. It is a class that is able to take in any type of message then send compressed versions of those messages
	 * As you can see, there are lots of conditional if statements inside that class. This is going to be problematic when we want to add more message types.
	 * How would we remove these if statements, but retain GenericMessageSenderService's capability to send any message types?
	 * */
	public static void main (String args[]) {
		GenericMessageSenderService genericMessageSenderService = new GenericMessageSenderService();
		List<Object> generatedMessages = generateMessages();
		generatedMessages.forEach(genericMessageSenderService::send);
	}
}
