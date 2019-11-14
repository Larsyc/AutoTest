package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public  void beforeSuit(){
        System.out.println( "before suite运行了");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("aftersuit运行了");
    }

    @BeforeTest
    public void test(){
        System.out.println("beforTest");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("afterTest");
    }
}
