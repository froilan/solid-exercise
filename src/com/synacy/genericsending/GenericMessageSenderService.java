package com.synacy.genericsending;

import com.synacy.Message;

/**
 * Created by froilan on 5/5/17.
 */
public class GenericMessageSenderService {
	public void send(Message message) {
		message.send();
	}
}
