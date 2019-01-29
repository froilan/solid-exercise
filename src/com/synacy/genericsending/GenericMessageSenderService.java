package com.synacy.genericsending;

import com.synacy.Sendable;

/**
 * Created by froilan on 5/5/17.
 */
public class GenericMessageSenderService {
	public void send(Sendable sendableMessage) {
		sendableMessage.send();
	}
}
