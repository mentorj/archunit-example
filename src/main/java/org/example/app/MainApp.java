package org.example.app;

import io.vavr.collection.List;
import org.example.domain.adapters.MQRelatedClass;
import org.example.infrastructure.DoSomethingWithMQ;

public class MainApp {
    public static void main(String[] args) {
        MQRelatedClass mqTool = new MQRelatedClass();
        mqTool.toString();
        List myList = List.of("1","2","3");
    }
}
