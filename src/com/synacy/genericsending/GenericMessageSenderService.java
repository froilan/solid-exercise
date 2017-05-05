package com.synacy.genericsending;

import com.synacy.FaxMessage;
import com.synacy.SmsMessage;

/**
 * Created by froilan on 5/5/17.
 */
public class GenericMessageSenderService {

	public void send(Object message) {
		if (message instanceof FaxMessage) {
			((FaxMessage) message).send();
		} else if (message instanceof SmsMessage) {
			((SmsMessage) message).send();
		}
		//some post sending logic here...
	}

}
