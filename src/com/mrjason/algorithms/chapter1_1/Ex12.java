package com.mrjason.algorithms.chapter1_1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-11
 * Time: 14:47
 */
public class Ex12 {
        public static void main(String[] args) {
            int[] a = new int[10];
            for (int i = 0; i < 10; i++) {
                a[i] = 9 - i;
            }
            for (int i = 0; i < 10; i++) {
                a[i] = a[a[i]];
            }
            // I don't understand why the author asks this
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            // I think the author should ask this
            for (int i = 0; i < 10; i++) {
                System.out.println(a[i]);
            }
        }
    }

