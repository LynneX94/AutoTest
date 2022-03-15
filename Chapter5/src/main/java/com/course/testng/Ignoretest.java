package com.course.testng;

import org.testng.annotations.Test;

public class Ignoretest {

    @Test
    public void ignore1(){
        System.out.println("ignore1执行成功");
    }

    // 忽略测试的方法
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2执行成功");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3执行成功");
    }
}
