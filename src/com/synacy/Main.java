package com.synacy;

import com.synacy.domain.FaxMessage;
import com.synacy.domain.Message;
import com.synacy.domain.SmsMessage;
import com.synacy.domain.StringMessage;
import com.synacy.services.ChargingServiceImpl;
import com.synacy.services.MessageSendFailedException;
import com.synacy.services.MessageServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by froilan on 5/5/17.
 */
public class Main {

	/**
	 * Main feature is to have a send method in FaxMessage and SmsMessage instances
	 * But sending different types of messages are exposed as well,
	 * how do we make this so that only their corresponding type of messages are sent?
	 * */


	/**
	 * Assume this will be the messages that has to be sent and charged
	 */
	public static List<Message> generateMessages() {
		return new ArrayList<Message>(Arrays.asList(new FaxMessage("631111111", "some fax message".getBytes()),
				new FaxMessage("632222222", "some fax message".getBytes()),
				new SmsMessage("633333333", "sms message"),
				new SmsMessage("634444444", "sms message"),
				new StringMessage("sample", "sample string"),
				new FaxMessage("63555555", "some fax message".getBytes())));
	}

	/**
	 * Main goal here is to be able to charge messages. Problem is, we if statements to determine which is which.
	 * If we add in more types of messages in the future, this will get very long.
	 * How do we make it so, that there will be no more if statements.
	 * */
	public static void main(String args[]) {
		MessageServiceImpl senderService = new MessageServiceImpl();

		senderService.setChargingService(new ChargingServiceImpl());

		List<Message> messages = generateMessages();

		messages.forEach((message) -> {
			try {
				senderService.send(message);

				System.out.println();

			} catch(MessageSendFailedException e) {
				System.out.println(e.getMessage());
			}
		});
	}

}


