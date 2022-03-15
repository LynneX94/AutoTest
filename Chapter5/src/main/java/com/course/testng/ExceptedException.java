package com.course.testng;

import org.testng.annotations.Test;

public class ExceptedException {
    /**
     * 什么时候会用到异常测试？
     * 在我们期望结果为某个异常的时候
     * 比如，我们传入某个不合法的参数，程序抛出异常
     * 即，我们的预期结果就是异常
     */
//这是一个失败的异常case
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个预期失败的异常case");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){

        System.out.println("这是一个异常测试case");
        throw new RuntimeException();

    }
}
