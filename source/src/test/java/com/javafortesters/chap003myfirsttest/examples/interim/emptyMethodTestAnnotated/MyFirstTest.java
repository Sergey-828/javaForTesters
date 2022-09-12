package com.javafortesters.chap003myfirsttest.examples.interim.emptyMethodTestAnnotated;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2 + 2;
        assertEquals("2+2=4",4,answer);
        System.out.println(answer);
    }
}