package com.company;

/**
 * Created by conorburke on 3/5/17.
 */
public class Sort {

    private int[] theArray = new int[50];

    private int arraySize = 10;

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

    public void bubbleSort() {
        for(int i = arraySize - 1; i > 1; i--) {
            for(int j = 0; j < i; j++) {
                if(theArray[j] > theArray[j+1]){
                    swapValues(j, j+1);
//                    printHorzArray(i, j);
                }
            }
        }
    }

    public void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void binarySearch(int value) {
        int lowIndex = 0;
        int highIndex = arraySize - 1;

        while(lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
            else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
            else {
                System.out.println("\nFound a macth for " + value + " at " + middleIndex);
                lowIndex = highIndex + 1;
            }
        }
    }

    public void selectionSort() {
        for(int x = 0; x < arraySize; x++) {
            int minimum = x;
            for (int y = x; y < arraySize; y++) {
                if (theArray[minimum] > theArray[y]) {
                    minimum = y;
                }
            }
            swapValues(x, minimum);
        }
    }

    public void insertionSort() {
        for(int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = theArray[i];
            while((j>0) && (theArray[j-1] > toInsert)) {
                theArray[j] = theArray[j-1];
                j--;
            }
            theArray[j] = toInsert;
        }
    }

    public static void main(String[] args) {
        Sort newArray = new Sort();
        newArray.generateRandomArray();

//        newArray.printArray();
//        newArray.bubbleSort();
//        newArray.printArray();
//
//        newArray.binarySearch(13);
//
//        newArray.printArray();
//        newArray.selectionSort();
//        newArray.printArray();

        newArray.printArray();
        newArray.insertionSort();
        newArray.printArray();


    }
}
