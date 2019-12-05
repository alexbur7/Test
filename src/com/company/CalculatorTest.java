package com.company;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator c;
    @org.junit.Before
    public void setUp() throws Exception {
        c=new Calculator();
    }

    @org.junit.Test
    public void sum() {
        assertEquals(15,c.sum(7,8));
    }

    @org.junit.Test
    public void mult() {
        assertEquals(225,c.mult(15,15));
    }
    @org.junit.Test
    public void r(){
        assertEquals(25,c.r(3));
    }
}