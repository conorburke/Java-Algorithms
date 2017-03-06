package com.company;

/**
 * Created by conorburke on 3/5/17.
 */
public class Recursion {

    public static void main(String[] args) {
        Recursion recursionTool = new Recursion();
//        recurionTool.calculateSquareToPrint(6);
        System.out.println(recursionTool.factorial(5));
        System.out.println(recursionTool.trianglularNumber(6));
    }

    public int factorial(int num) {
        if(num < 2) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    public int trianglularNumber(int num) {
        if(num < 2) {
            return 1;
        } else {
            return (num + trianglularNumber(num - 1));
        }
    }

}
