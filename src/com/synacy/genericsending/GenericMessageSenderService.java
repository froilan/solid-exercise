package com.synacy.genericsending;

import com.synacy.messages.Message;
import com.synacy.sending.MessageSendFailedException;

/**
 * Created by froilan on 5/5/17.
 */
public class GenericMessageSenderService {

	public void send(Object message) throws MessageSendFailedException {

		((Message) message).send();

		//some post sending logic here...
	}

}
