package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultithreadOnXml {

    @Test
    public void test001(){
        System.out.printf("ThreadID = %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test002(){
        System.out.printf("ThreadID = %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test003(){
        System.out.printf("ThreadID = %s%n",Thread.currentThread().getId());
    }

}
