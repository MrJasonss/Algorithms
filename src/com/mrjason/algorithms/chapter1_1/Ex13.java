package com.mrjason.algorithms.chapter1_1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-11
 * Time: 14:55
 */
public class Ex13 {
    public static void printTransposedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) { // 3
            for (int j = 0; j < matrix.length; j++) {
//                System.out.println(matrix.length);//2
                System.out.printf("%4d", matrix[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 100, 200, 300 }, { 400, 500, 600 },{700,800,900} };
        printTransposedMatrix(a);
    }
}
