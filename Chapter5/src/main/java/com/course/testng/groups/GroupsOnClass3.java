package com.course.testng.groups;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.Test;

import javax.crypto.spec.PSource;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher111(){
        System.out.println("GroupsOnClass3中的teacher111");
    }

    public void teacher222(){
        System.out.println("GroupsOnClass3中的teacher222");
    }
}
