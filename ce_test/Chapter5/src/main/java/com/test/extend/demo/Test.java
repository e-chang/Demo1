package com.test.extend.demo;/**
 * @Auther: wang
 * @Date: 2019/7/17 13:51
 */

import org.testng.Assert;
import org.testng.Reporter;

/**
 * @author:
 * @date:
 */
public class Test {
    @org.testng.annotations.Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @org.testng.annotations.Test
    public void test2(){
        Assert.assertEquals(1,1);
    }


    @org.testng.annotations.Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }


    @org.testng.annotations.Test
    public void logDemo(){
        Reporter.log("这是故意写入的日志");
        throw new RuntimeException("故意运行时异常");
    }

}

