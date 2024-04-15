package org.example;

import java.util.EmptyStackException;

public class MyQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public void enqueue(int element) {
        if (currentSize < maxSize) {
            rear = (rear + 1) % maxSize; // Circular increment to wrap around
            queueArray[rear] = element;
            currentSize++;
        } else {
            System.out.println("Queue Overflow: Cannot enqueue element " + element + ". Queue is full.");
        }
    }

    public int dequeue(){
        if (!isEmpty()) {
            int removedElement = queueArray[front];
            front = (front + 1) % maxSize; // Circular increment to wrap around
            currentSize--;
            return removedElement;
        } else {
            throw new EmptyStackException();
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue peek: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        System.out.println("Queue size after dequeuing all elements: " + queue.size());
    }

}