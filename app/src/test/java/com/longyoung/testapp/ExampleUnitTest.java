package com.longyoung.testapp;

import android.content.Intent;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test(){
        System.out.println("abc");

        int in = 21658;

        String inStr = String.valueOf(in);
        int len = inStr.length();
        int[] ary = new int[len];
        for (int i=0; i<len; i++){
            ary[i] = Integer.valueOf(inStr.substring(len - 1 - i, len - i));
            System.out.println("a=" + ary[i]);
        }


    }

}