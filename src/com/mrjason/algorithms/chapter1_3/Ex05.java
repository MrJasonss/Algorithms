package com.mrjason.algorithms.chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex05 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        Stack<Integer> stack = new Stack<Integer>();
        while (N > 0) {  //判断循环条件
            stack.push(N % 2);  //对2取余后压入栈底
            N = N / 2;            //N除以2  继续循环
        }

        //遍历栈输入   注意栈的特性   先进后出
        for (int d : stack) {
            StdOut.print(d);
        }
        StdOut.println();
    }
}
