package com.mrjason.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Ex35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double [] dist = new double[2*SIDES+1];
        for(int i = 1;i<=SIDES;i++){
            for(int j = 1;j<=SIDES;j++){
                dist[i+j] +=1.0;
            }
        }
        System.out.print("Probability:");
        for (int k=2;k<=2*SIDES;k++){
            dist[k] /=36.0;
            System.out.printf("%6.3f", dist[k]);
        }
        System.out.println();
        int [] num = new int[2*SIDES+1];
        int N = StdIn.readInt();
        for (int i =0;i<N;i++){
            num[StdRandom.discrete(dist)]++;
        }
        double frequency;
        boolean isAccurate = true;
        System.out.print("Frequency:");
        for (int i = 2; i <= 2 * SIDES; i++) {
            frequency = (double) num[i] / N;
            System.out.printf("%6.3f", frequency);
            if (Math.abs(frequency - dist[i]) > 0.001) {
                isAccurate = false;
            }
        }
        System.out.println();
        System.out.println("Is accurate? " + isAccurate);


    }
}

//
//
//
//
//    private static int SIDES = 6;
//
//    public static double[] getExact()
//    {
//        double[] dist = new double[2*SIDES+1];
//
//        for (int i = 1; i <= SIDES; i++)
//            for (int j = 1; j <= SIDES; j++)
//                dist[i+j] += 1.0;
//
//        for (int k = 2; k <= 2*SIDES; k++)
//            dist[k] /= SIDES*SIDES;
//
//        return dist;
//    }
//
//    public static double[] getExperim(int n)
//    {
//        double[] dist = new double[2*SIDES+1];
//
//        for (int i = 0; i < n; i++)
//            dist[throwDice()]++;
//
//        for (int k = 2; k <= 2*SIDES; k++)
//            dist[k] /= n;
//
//        return dist;
//    }
//
//    public static int throwDice()
//    {
//        return StdRandom.uniform(1, SIDES+1) + StdRandom.uniform(1, SIDES+1);
//    }
//
//    public static void main(String[] args)
//    {
//        int n = Integer.parseInt(args[0]);
//
//        double[] exact = getExact();
//
//        for (int i = 2; i <= 2*SIDES; i++)
//            StdOut.printf("%7d", i);
//        StdOut.println();
//
//        for (int i = 2; i <= 2*SIDES; i++)
//            StdOut.printf("%7.3f", exact[i]);
//        StdOut.println();
//
//        double[] experim = getExperim(n);
//
//        for (int i = 2; i <= 2*SIDES; i++)
//            StdOut.printf("%7.3f", experim[i]);
//        StdOut.println();
//
//        // Empirical results match exact ones to 3 decimal places when
//        // n >= 10,000,000  (< 1 sec.)
//    }





