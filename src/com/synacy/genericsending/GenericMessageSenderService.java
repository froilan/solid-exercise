package com.synacy.genericsending;

import com.synacy.FaxMessage;
import com.synacy.Message;
import com.synacy.SmsMessage;
import com.synacy.sending.MessageSendFailedException;

/**
 * Created by froilan on 5/5/17.
 */
public class GenericMessageSenderService {

	public void send(Message message) throws MessageSendFailedException {
		message.send();
		//some post sending logic here...
	}

}
