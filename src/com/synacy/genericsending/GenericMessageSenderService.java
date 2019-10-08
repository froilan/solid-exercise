package com.synacy.genericsending;

import com.synacy.FaxMessage;
import com.synacy.SmsMessage;

/**
 * Created by froilan on 5/5/17.
 */
public class GenericMessageSenderService {

	public void send(Object message) {
		if (message instanceof FaxMessage) {
			String faxCompressedMessage = ((FaxMessage) message).generateCompressedMessage();
			String destination = ((FaxMessage) message).getDestination();
			//some fax sending specific logic here that uses destination and the compressed message.
		} else if (message instanceof SmsMessage) {
			String smsCompressedMessage = ((SmsMessage) message).generateCompressedMessage();
			String destination = ((SmsMessage) message).getDestination();
			//some fax sending specific logic here that uses destination and the compressed message.
		}
		//some post sending logic here...
	}

}
