package com.test;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups= {"Sanity"})
    public void method3() {
        
        System.out.println("Inside Test1 method3 Sanity");
    }
	@Test(groups= {"Regression"})
    public void method4() {
        
        System.out.println("Inside Test1 method4 Regression");
    }
	@Test(groups= {"Regression"})
    public void method5() {
        
        System.out.println("Inside Test1 method5 Regression");
    }
	@Test
    public void method1() {
        
        System.out.println("Inside Test1 method1");
    }
    
    @Test
    public void method2() {
        
        System.out.println("Inside Test1 method2");
    }
    

}
