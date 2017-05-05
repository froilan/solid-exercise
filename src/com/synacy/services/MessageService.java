package com.synacy.services;

import com.synacy.domain.Message;

/**
 * Created by michael on 5/5/17.
 */
public interface MessageService {
    void send(Message message) throws MessageSendFailedException;
}
