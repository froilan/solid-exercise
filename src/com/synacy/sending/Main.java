package com.synacy.sending;

import com.synacy.FaxMessage;
import com.synacy.SmsMessage;

/**
 * Created by froilan on 5/5/17.
 */
public class Main {

	/**
	 * Main feature is to have a send method in FaxMessage and SmsMessage instances
	 * But sending different types of messages are exposed as well,
	 * how do we make this so that only their corresponding type of messages are sent?
	 * */
	public static void main(String args[]){

		try {
			FaxMessage faxMessageToSend = new FaxMessage("632222222", "some fax message".getBytes());
			faxMessageToSend.send();

			FaxMessage faxMessageToFail = new FaxMessage("", null);
			faxMessageToFail.send();
		} catch(MessageSendFailedException e){
			System.out.println(e.getMessage());
		}

		try {
			SmsMessage smsMessageToSend = new SmsMessage("633333333", "sms message");
			smsMessageToSend.send();
			SmsMessage smsMessageToFail = new SmsMessage("", "");
			smsMessageToFail.send();
		} catch (MessageSendFailedException e) {
			System.out.println(e.getMessage());
		}

	}

}


