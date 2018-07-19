package com.mrjason.algorithms.chapter1_1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-19
 * Time: 15:55
 */
public class Ex28 {
    public static void main(String[] args) {
        int[] whitelist = {7, 1, 5, 1, 9, 5, 7, 7, 5, 1};

        // sort the array
        Arrays.sort(whitelist);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < whitelist.length - 1; i++) {
            if (whitelist[i] != whitelist[i + 1]) {
                list.add(whitelist[i]);
            }
        }
        list.add(whitelist[whitelist.length - 1]);
        whitelist = new int[list.size()];
        for (int i = 0; i < whitelist.length; i++) {
            whitelist[i] = list.get(i);
            System.out.print(whitelist[i] + " ");
        }
        System.out.println();
        System.out.println(BinarySearch.indexOf(whitelist, StdIn.readInt()));
    }
}
