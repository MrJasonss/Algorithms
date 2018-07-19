package com.mrjason.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-19
 * Time: 15:15
 */
public class Ex26 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if(a>b){
            int t = a;
            a = b;
            b = t;
        }
        if(a>c){
            int t = a;
            a = c;
            c = t;
        }
        if(b>c){
            int t = b;
            b = c;
            c = t;
        }

        System.out.println("a = "+ a +",b = "+ b + ",c = "+c);

    }
}
