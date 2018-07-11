package com.mrjason.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-11
 * Time: 10:13
 */
public class Ex09 {


//    public  static  String toBinaryString(int N){
//        if(N==0){
//            return "0";
//        }
//        int bufLen = 32;
//        int index = bufLen;
//        char [] result = new char[bufLen];
//        do {
//            // 使用 & 符合相对除 2 提升一定性能
//            result[--index] = '0' + (value & 1);
//            value = value >>> 1;
//        } while (value != 0);
//        return new String(result, index, bufLen - index);
//
//    }

    public static void main(String[] args) {
//        int value = -1024;
//        System.out.println("value:"+ value + "; result for toBinaryString>>>\r\n\t" + toBinaryString(value));
        int N = 234245;

        StdOut.println(Integer.toBinaryString(N));

        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        StdOut.println(s);
    }
}
