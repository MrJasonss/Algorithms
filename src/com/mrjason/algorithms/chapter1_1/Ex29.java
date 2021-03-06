package com.mrjason.algorithms.chapter1_1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo-b
 * Date: 2018-07-19
 * Time: 16:18
 */
public class Ex29 {
    public static int rank(int key,int[] a){
        int count = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i] == key){
                count++;
            }else {
                break;
            }
        }
        return count;
    }

    public static int count(int key,int [] a){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if (a[i] == key){
                count++;
            }else if(a[i]>key){
                        break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] whitelist = { 7, 1, 5, 1, 9, 5, 7, 7, 5 };
        Arrays.sort(whitelist);
        int key = 5;
        int i = rank(key,whitelist);
        int j = count(key,whitelist);
        System.out.println("The count less than key: " + i);
        System.out.println("The count equals key: " + j);
        if (j>0){
            System.out.println("The key:");
            for(int k=i;k<=i+j-1;k++){
                System.out.println(whitelist[k]);
            }
        }
    }
}
