package com.mrjason.algorithms.chapter1_3;


import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//双向栈的实现
public class Evaluate {

    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();   //运算符栈
        Stack<Double> vals = new Stack<Double>();   //操作数栈
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if(s.equals("(")){
                ;
            }else if (s.equals("+")){
                ops.push(s);
            }else if(s.equals("-")){
                ops.push(s);
            }else if(s.equals("*")){
                ops.push(s);
            }else if(s.equals("/")){
                ops.push(s);
            }else if(s.equals("sqrt")){
                ops.push(s);
            }else if(s.equals(")")){
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")){
                    v = vals.pop()+v;
                }else if(op.equals("-")){
                    v = vals.pop()-v;
                }else if(op.equals("*")){
                    v = vals.pop()*v;
                }else if(op.equals("/")){
                    v = vals.pop() / v;
                }else if(op.equals("sqrt")){
                    v = Math.sqrt(v);
                }
                vals.push(v);
            }else {
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
