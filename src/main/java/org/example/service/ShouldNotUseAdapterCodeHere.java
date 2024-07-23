package org.example.service;

import org.example.domain.adapters.MQRelatedClass;

public class ShouldNotUseAdapterCodeHere {
    public void foobar(){
        MQRelatedClass mqTool = new MQRelatedClass();
        mqTool.toString();
    }
}
