package org.example;

import java.util.EmptyStackException;

public class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1; // Initialize top to -1 indicating an empty stack
    }

    public void push(int element) {
        if (top + 1 < maxSize) {
            stackArray[++top] = element;
        } else {
            System.out.println("Stack Overflow: Cannot push element " + element + ". Stack is full.");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            throw new EmptyStackException();
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Stack size after popping all elements: " + stack.size());
    }
}

