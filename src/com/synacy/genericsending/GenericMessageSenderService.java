package com.synacy.genericsending;

import com.synacy.Message;

public class GenericMessageSenderService<T extends Message> {

	public void send(T message) {
		message.send();
		//some post sending logic here...
	}

}