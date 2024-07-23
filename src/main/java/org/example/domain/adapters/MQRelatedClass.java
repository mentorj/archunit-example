package org.example.domain.adapters;

import org.example.infrastructure.DoSomethingWithMQ;

public class MQRelatedClass {
    public MQRelatedClass() {
        DoSomethingWithMQ mq = new DoSomethingWithMQ();
        mq.foobar();
    }
}
