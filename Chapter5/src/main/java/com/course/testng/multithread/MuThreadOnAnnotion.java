package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MuThreadOnAnnotion {

    @Test(invocationCount = 10)
    public void test1(){
        System.out.println(1);
    }


    @Test(invocationCount = 2, threadPoolSize = 5)
    public void test2(){
        System.out.println(1);
        System.out.printf("ThreadId = %s%n",Thread.currentThread().getId());
    }


}
