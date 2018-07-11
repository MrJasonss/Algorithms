package com.mrjason.algorithms.chapter1_1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-11
 * Time: 15:13
 */
public class Ex14 {
        private static int lg(int n) {
            int shiftRightCount = 0;
            do {
                n >>= 1;
                shiftRightCount++;
            } while (n != 0);
            return shiftRightCount - 1;
        }

        public static void main(String[] args) {
            int value = 1025;
            System.out.printf("the result of method log is :%s\r\n", lg(value));
        }
    }
