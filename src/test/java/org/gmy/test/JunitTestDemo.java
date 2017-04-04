package org.gmy.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chenghao on 2017/3/30.
 */
public class JunitTestDemo {
    @Test
    public void JunitTestDemo() {
        //Assert.assertEquals(,10);
        boolean condition=true;
        //Assert.assertTrue(condition);
        //Assert.assertNotEquals(condition,true);
        System.out.println("耗子才是猪猪");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }


    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }@Test
    public void test6(){
        System.out.println("test6");
    }
    @Test
    public void test4(){
        System.out.println("test4");
    }




}
