package com.company;

import java.util.Arrays;

/**
 * Created by conorburke on 3/6/17.
 */
public class Shell {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    Shell(int arraySize) {
        this.arraySize = arraySize;
        theArray = new int[arraySize];
        generateRandomArray();
    }

    public void generateRandomArray(){
        for(int i = 0; i < arraySize; i++)  {
            theArray[i] = (int)(Math.random()*10) + 10;
        }
    }

    public void printArray(){
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public void sort() {
        int inner, outer, temp;
        int interval = 1;
        while(interval <= arraySize / 3) {
            interval = interval * 3 + 1;
            while(interval > 0) {
                for(outer = interval; outer < arraySize; outer++) {
                    temp = theArray[outer];
                    System.out.println("Copy " + theArray[outer] + " into temp");
                    inner = outer;
                    System.out.println("Checking if " + theArray[inner - interval] + "in index is bigger than " + temp);
                    while(inner > interval - 1 && theArray[inner - interval] >= temp) {
                        System.out.println("Checking if " + theArray[inner - interval] + " in index " +
                                (inner - interval) + " is bigger than " + temp);
                        theArray[inner] = theArray[inner - interval];
                        System.out.println(theArray[inner - interval] + " moved ot index " + inner);
                        inner -= interval;
                        System.out.println("inner = " + inner);
                        System.out.println("outer = " + outer);
                        System.out.println("temp = " + temp);
                        System.out.println("interval = " + interval);
                    }
                    theArray[inner] = temp;
                    System.out.println(temp + " moved ot index " + inner);
                }
                interval = (interval - 1) / 3;
            }
        }
    }

    public static void main(String[] args) {
        Shell shell = new Shell(10);
        System.out.println(Arrays.toString(shell.theArray));
        shell.sort();
        System.out.println(Arrays.toString(shell.theArray));
    }
}
