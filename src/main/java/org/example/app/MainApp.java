package org.example.app;

import org.example.infrastructure.DoSomethingWithMQ;

public class MainApp {
    public static void main(String[] args) {

        DoSomethingWithMQ mq = new DoSomethingWithMQ();
        mq.foobar();
    }
}
