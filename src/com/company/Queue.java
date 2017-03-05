package com.company;

import java.util.Arrays;

/**
 * Created by conorburke on 3/5/17.
 */
public class Queue {

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    Queue(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input) {
        if(numberOfItems + 1 < queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("insert " + input + " was added to queue");
        } else {
            System.out.println("Queue full");
        }
    }

    public void remove() {
        if(numberOfItems > 0) {
            System.out.println("remove " + queueArray[front] + " from the queue");
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
        } else {
            System.out.println("no items in queue");
        }
    }

    public void displayTheQueue(){
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < queueSize; n++){
            System.out.format("| %2s "+ " ", n);
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < queueSize; n++){
            if(queueArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s "+ " ", queueArray[n]));
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        // Number of spaces to put before the F
        int spacesBeforeFront = 3*(2*(front+1)-1);
        for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");
        System.out.print("F");
        // Number of spaces to put before the R
        int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);
        for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");
        System.out.print("R");
        System.out.println("\n");
    }

    public String moveUp() {
        String shifted = "";
        if(numberOfItems > 0) {
            System.out.println("remove " + queueArray[front] + " from the queue");
            shifted = queueArray[0];
            for(int i = 0; i < queueSize - 1; i++) {
                queueArray[i] = queueArray[i+1];
            }
            numberOfItems--;
        } else {
            System.out.println("no items in queue");
        }
        return shifted;
    }


    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.insert("10");
        queue.insert("13");
        queue.insert("14");
        queue.displayTheQueue();
//        queue.remove();
//        queue.displayTheQueue();
        System.out.println(queue.moveUp());
        queue.displayTheQueue();
    }
}
