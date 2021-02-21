package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
	
	@BeforeTest
    public void beforetest() {
        
        System.out.println("Inside Before Test");
    }
    
    @BeforeMethod
    public void beforemethod() {
        
        System.out.println("Inside Before Method");
    }
    
    @Test
    public void method1() {
        
        System.out.println("Inside method1");
    }
    
    @Test
    public void method2() {
        
        System.out.println("Inside method2");
    }
    
    
    @AfterMethod
    public void aftermethod() {
        
        System.out.println("Inside After Method");
    }
    
    @AfterTest
    public void aftertest() {
        
        System.out.println("Inside After Test");
    }


}
