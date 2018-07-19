package com.mrjason.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MrJason
 * Date: 2018-07-18
 * Time: 21:28
 */
public class Ex19 {
    public  static long[] F(int N){
        long [] fibonacci = new long[N+1];
        if(N==0){
            return fibonacci;
        }
        fibonacci[1] = 1;
        if(N==1){
            return fibonacci;
        }
        for (int i = 2; i <= N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
    public static void main(String[] args) {
//        for(int N=0;N<100;N++){
//            //打印菲波那切数列
//            StdOut.println(N+" "+ F(N));
//        }

        long[] fibonacci = F(99);
        for (int N = 0; N < fibonacci.length; N++) {
            StdOut.println(N + " " + fibonacci[N]);
        }
    }
}
