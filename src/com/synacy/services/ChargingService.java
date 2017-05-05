package com.synacy.services;

import com.synacy.domain.Message;

/**
 * Created by michael on 5/5/17.
 */
public interface ChargingService {
    void chargeMessage(Message message);
}
