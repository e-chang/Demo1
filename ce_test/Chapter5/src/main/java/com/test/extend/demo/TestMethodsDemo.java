package com.test.extend.demo;/**
 * @Auther: wang
 * @Date: 2019/7/17 12:04
 */

import freemarker.core.ReturnInstruction;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author:
 * @date:
 */
public class TestMethodsDemo {
    @Test
    public void test1() {
        Assert.assertEquals(1, 1);
    }


    @Test
    public void test2() {
        Assert.assertEquals(1, 1);
    }


    @Test
    public void test3() {
        Assert.assertEquals("aaa", "aaa");
    }


    @Test
    public void logDemo() {
        Reporter.log("这是故意写入的日志");
        throw new RuntimeException("故意运行时异常");
    }
/*

    @Test(dataProvider = "data")
    public void test1(int a,int b){
        System.out.println(a+b);
    }

    @DataProvider(name = "data")

    public Object[][] providerData(){
        Object a[][]=new Object[][]{
                {1,2},
                {1,2},


        };
        return a;
    }a
*/


}
