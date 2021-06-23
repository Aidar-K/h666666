package com.example.lesson6android3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    private Math math;

    @Before
    public void start() {
        math = new Math();
        System.out.println("Before");
    }

    @Test
    public void addTest() {
        assertEquals(6, math.add(4, 2));
        System.out.println("add");
    }

    @Test
    public void minus() {
        assertEquals(2, math.minus(4, 2));
        System.out.println("minus");
    }

    @Test
    public void Unique() {
        assertEquals(8, math.umnojenie(4, 2));
        System.out.println("Unique");
    }

    @Test
    public void del() {
        assertEquals(2, math.delenie(4, 2));
        System.out.println("del");
    }

    @After
    public void end() {
        System.out.println("after");
    }
}
