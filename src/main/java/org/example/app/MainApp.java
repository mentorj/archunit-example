package org.example.app;

import io.vavr.collection.List;
import org.example.domain.adapters.MQRelatedClass;


import java.time.Instant;
import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        MQRelatedClass mqTool = new MQRelatedClass();
        mqTool.toString();
        List myList = List.of("1","2","3");
        Date d = Date.from(Instant.now());
    }
}
