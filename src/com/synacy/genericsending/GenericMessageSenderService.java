package com.synacy.genericsending;

import com.synacy.messages.Message;

/**
 * Created by froilan on 5/5/17.
 */
public class GenericMessageSenderService {

	public void send(Object message) {

		((Message) message).send();

		//some post sending logic here...
	}

}
