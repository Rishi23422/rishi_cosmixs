package com.testing.sample;

import static org.junit.Assert.*;
import org.junit.Test;

public class SampleUnitTest {

    @Test
    public void testAdd(){
        System.out.println("add");
        Integer a=15;
        Integer b=20;

        Integer expResult = 35;
        Integer result = SampleUtil.add(a,b);

        assertEquals(expResult, result);
        
    }

    @Test
    public void testAdd1(){
        assertEquals(null, SampleUtil.add(15,null));
    }

    @Test
    public void testAdd2(){
        assertEquals(null, SampleUtil.add(null,20));
    }

    @Test
    public void testAdd3(){
        assertEquals(null, SampleUtil.add(null,null));
    }
    
}
