package com.synacy.sending;

import com.synacy.messages.FaxMessage;
import com.synacy.messages.SmsMessage;

/**
 * This is a stable and well used class by other classes, so nothing should be changed here.
 */
public class MessageSender {

	public void sendFaxMessage(FaxMessage message) {
		System.out.println("sending fax message");
		//send fax message logic
	}

	public void sendSmsMessage(SmsMessage message) {
		System.out.println("sending sms message");
		//send fax message logic
	}

	public void sendStringMessage(String message) {
		System.out.println("sending string message");
		//send string message logic
	}

}
