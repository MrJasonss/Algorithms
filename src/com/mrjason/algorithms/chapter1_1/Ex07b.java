package com.mrjason.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-11
 * Time: 9:51
 */
public class Ex07b {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i<1000;i++){
            for(int j =0;j<i;j++){
                sum++ ;
            }
            StdOut.println(sum);
        }
        StdOut.print(sum);
    }

    //循环几次就加几  1   1+2=>3   3+3=>6       总结果  999 *500
}
