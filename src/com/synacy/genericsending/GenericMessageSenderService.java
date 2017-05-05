package com.synacy.genericsending;

import com.synacy.Message;
import com.synacy.sending.MessageSendFailedException;

public class GenericMessageSenderService<T extends Message> {

	public void send(T message) throws MessageSendFailedException {
		message.send();
		//some post sending logic here...
	}

}