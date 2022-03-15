package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

import java.lang.reflect.Method;

public class DataProviderTest {
    /**
     * 使用DataProvider进行参数化
     */
    @Test(dataProvider = "dataTest1")
    public void dataProviderTest1(String name, int age){
        System.out.println("name= " + name + ", age= " + age);
    }

    @DataProvider(name = "dataTest1")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"Mary", 10},
                {"Henry", 20},
                {"Tony", 30},
                {"Tony", 30}
        };
        return o;
    }

    @Test(dataProvider = "MethodTest")
    public void dataProviderTest2(String name, int age){
        System.out.println("dataProviderTest222方法的结果 name= " + name + "， age= " + age);
    }

    @Test(dataProvider = "MethodTest")
    public void dataProviderTest3(String name, int age){
        System.out.println("dataProviderTest333方法的结果 name= " + name + "， age= " + age);
    }


    @DataProvider(name = "MethodTest")
    public Object[][] methodTestData(Method method){
        Object[][] result = null;
        if(method.getName().equals("dataProviderTest2")){
            result = new Object[][]{
                    {"one", 10},
                    {"two", 20},
            };

        }else if(method.getName().equals("dataProviderTest3")){
            result = new Object[][]{
                    {"three", 30},
                    {"four", 40},
            };
        }
        return result;
    }

}
