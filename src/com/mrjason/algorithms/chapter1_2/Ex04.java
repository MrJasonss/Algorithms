package com.mrjason.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class Ex04 {
    public static void main(String[] args) {
        String string1 = "hello";     //string1 = "hello"
        String string2 = string1;     //string2 = "hello"
        string1 = "world";            //string1 = "world"
        StdOut.println(string1);      //string2 = "hello"
        StdOut.println(string2);
    }
}