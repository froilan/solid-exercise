
package com.synacy.domain;

import java.math.BigDecimal;

/**
 * Created by michael on 5/5/17.
 */
public abstract class Message<T> implements Costable {
    private String sendTo;
    private T content;

    public Message() {}

    public Message(String sendTo,T content) {
        setSendTo(sendTo);
        setContent(content);
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public T getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = (T) content;
    }

    abstract public BigDecimal calculateCost();
}