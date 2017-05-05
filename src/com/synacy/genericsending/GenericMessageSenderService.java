package com.synacy.genericsending;

/**
 * Created by froilan on 5/5/17.
 */
public class GenericMessageSenderService {

//	public void send(Object message) {
//		if (message instanceof FaxMessage) {
//			((FaxMessage) message).send();
//		} else if (message instanceof SmsMessage) {
//			((SmsMessage) message).send();
//		}
//		//some post sending logic here...
//	}

	public void send(TypeHandler message) {
		message.send();
	}

}
