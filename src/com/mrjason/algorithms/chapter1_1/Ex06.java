package com.mrjason.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-11
 * Time: 9:37
 */
public class Ex06 {

    public static void main(String[] args) {
        int f = 0;
        int g= 1;
        for (int i = 0;i<=15;i++){
            StdOut.print(f);
            f=f+g;
            StdOut.print(f);
            g=f-g;
            StdOut.print(g);
        }
    }

}
