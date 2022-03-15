package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
 /*基本注解*/
    @Test
    public void testCase1(){
        System.out.println("This is test case-1");
    }

    @Test
    public void testCase2(){
        System.out.println("This is test case-2");
    }

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("这是在testCase之前运行的方法");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在每个testCase之后运行的方法");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行后运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件，在类运行之前运行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件，在类运行之后运行");
    }

}
