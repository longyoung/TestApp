package com.longyoung.testapp;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

//        addMul(398100, -1);

        int nums[] = {3,2,3};
        int target = 6;

//        int[] result = new int[2];
//        int temp1 = 0;
//        int temp2 = 0;
//        for (int j=0; j<nums.length; j++){
//            temp1 = nums[j];
//            for(int k=0; k<j; k++){
//                temp2 = nums[k];
//                if (temp1 + temp2 == target){
//                    result[0] = k;
//                    result[1] = j;
//                    System.out.println("abc=" + result[0] + result[1]);
//                    return;
//                }
//
//            }
//        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length; i++){
            int com = target - nums[i];
            if (map.containsKey(com)){
                System.out.println("aa=" + map.get(nums[i]) + i);
                return;
            }
            map.put(nums[i], i);
        }

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