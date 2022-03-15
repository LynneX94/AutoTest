package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    /**
     * 依赖测试，当被依赖的方法执行失败后，依赖方不会执行。 比如登录失败了，则不执行支付
     */

    @Test
    public void test1(){
        System.out.println("run test1");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("run test2");
    }

}
