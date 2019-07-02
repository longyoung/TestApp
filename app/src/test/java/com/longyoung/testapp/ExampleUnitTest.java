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

        addMul(398130, -1);

    }

    private void addMul(int in, int zeng){
        int lianXvNineCount = 0;
        boolean isLian = true;

        in += zeng;
        String tempStr = String.valueOf(in);
        int len = tempStr.length();
        for (int i=0; i<len; i++){
            if (zeng > 0){
                if (Integer.valueOf(tempStr.substring(len - 1 - i, len - i)) == 0 && isLian){
                    lianXvNineCount++;
                } else {
                    isLian = false;
                }
            } else {
                if (Integer.valueOf(tempStr.substring(len - 1 - i, len - i)) == 9 && isLian){
                    lianXvNineCount++;
                } else {
                    isLian = false;
                }
            }
        }

        System.out.println("lian=" + lianXvNineCount);

        tempStr = tempStr.substring(len - 1 - lianXvNineCount, len);

        System.out.println("inStr=" + tempStr);

    }

    private void addMul2(int in, int zeng){
        int lianXvNineCount = 0;
        boolean isLian = true;

        String tempStr = String.valueOf(in);
        int len = tempStr.length();
        for (int i=0; i<len; i++){
            if (Integer.valueOf(tempStr.substring(len - 1 - i, len - i)) == 9 && isLian){
                lianXvNineCount++;
            } else {
                isLian = false;
            }
        }

        System.out.println("lian=" + lianXvNineCount);

        if (len > lianXvNineCount){//位数一样
            in += zeng;
            tempStr = String.valueOf(in);
            tempStr = tempStr.substring(len - 1 - lianXvNineCount, len);
        } else {//位数加1
            len++;

            in += zeng;
            tempStr = String.valueOf(in);
            tempStr = tempStr.substring(len - 1 - lianXvNineCount, len);
        }

        System.out.println("inStr=" + tempStr);
    }

}