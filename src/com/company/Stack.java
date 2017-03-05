package com.company;

import java.util.Arrays;

/**
 * Created by conorburke on 3/5/17.
 */
public class Stack {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    Stack(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    public void displayTheStack() {
        for(int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for(int n = 0; n < stackSize; n++) {
            System.out.format("| %2s " + " ", n);
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for(int n = 0; n < stackSize; n++) {
            if(stackArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s " + " ", stackArray[n]));
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
    }

    public void push(String input) {
        if(topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else System.out.println("Sorry, stack is full");
        displayTheStack();
        System.out.println(input + " was added to the stack");
    }

    public String pop() {
        if(topOfStack >= 0) {
            displayTheStack();
            System.out.println("Top of stack was removed");
            stackArray[topOfStack] = "-1";
            displayTheStack();
            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Stack is empty");
            return "-1";
        }
    }

    public String peek(){
        displayTheStack();
        System.out.println("peek " + stackArray[topOfStack] + " is at the top");
        return stackArray[topOfStack];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push("10");
        stack.push("13");
        stack.peek();
        stack.pop();


    }
}
