package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu111(){
        System.out.println("GroupsOnClass1中的stu111");
    }

    public void stu222(){
        System.out.println("GroupsOnClass1中的stu222");
    }
}
