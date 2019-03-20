package com.mrjason.algorithms.chapter1_3;

import edu.princeton.cs.algs4.StdOut;

/*************************************************************************
 *
 *  Josephus problem
 *
 *  % java Ex_1_3_37 7 2
 *  1 3 5 0 4 2 6
 *
 *************************************************************************/

public class Ex37
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]),
                m = Integer.parseInt(args[1]);

        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < n; i++)
            q.enqueue(new Integer(i));

        int k = 0;
        while (!q.isEmpty())
        {
            int x = q.dequeue();

            if (++k % m == 0)
                StdOut.print(x + " ");
            else
                q.enqueue(x);
        }
        StdOut.println();
    }
}