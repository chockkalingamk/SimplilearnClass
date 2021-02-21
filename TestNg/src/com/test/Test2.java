package com.test;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups= {"Sanity"})
    public void method6() {
        
        System.out.println("Inside Test2 method6 Sanity");
    }
	@Test
    public void method1() {
        
        System.out.println("Inside Test2 method1");
    }
    
    @Test
    public void method2() {
        
        System.out.println("Inside Test2 method2");
    }
    

}
