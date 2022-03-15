package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu111(){
        System.out.println("GroupsOnClass2中的stu111");
    }
    public void stu222(){
        System.out.println("GroupsOnClass2中的stu222");
    }
}
