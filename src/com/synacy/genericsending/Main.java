package com.synacy.genericsending;

import com.synacy.FaxMessage;
import com.synacy.SmsMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by froilan on 5/5/17.
 */
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
	 * In the previous example, we are able to send each message knowing what the message type prior.
	 * Now, what if we want to have a method that is able to send any message without using conditional statements.
	 * Let's call that class GenericMessageSenderService.
	 * */
	public static void main (String args[]) {
		GenericMessageSenderService genericMessageSenderService = new GenericMessageSenderService();
		generateMessages().forEach((message) -> {
			genericMessageSenderService.send((TypeHandler) message);
		});
	}
}
