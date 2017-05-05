package com.synacy.sending;

import com.synacy.FaxMessage;
import com.synacy.Message;
import com.synacy.SmsMessage;

public class Main {

	/**
	 * Main feature is to have a send method in FaxMessage and SmsMessage instances
	 * But sending different types of messages are exposed as well,
	 * how do we make this so that only their corresponding type of messages are sent?
	 * */
	public static void main(String args[]) {

		Message faxMessageToSend = new FaxMessage("632222222", "some fax message".getBytes());
		faxMessageToSend.send();

		Message smsMessageToSend = new SmsMessage("633333333", "sms message");
		smsMessageToSend.send();
	}

}


