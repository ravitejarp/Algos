package com.ravi.algos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackImpl {

    int top;
    int size;
    private char[] stack;

    public StackImpl(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new char[size];
    }

    public static void main(String[] args) throws IOException {
//        StackImpl stack = new StackImpl(12);
//        stack.push(23);
//        stack.push(24);
//        for(int i=2;i<14;i++){
//            stack.push(i);
//        }
//        System.out.println("PEEK:" + stack.peek());
//        System.out.println("IsEmpty:" + stack.isEmpty());
//        System.out.println("IsFull:" + stack.isFull());
//        stack.display();
//        System.out.println("POP:" + stack.pop());
//        System.out.println("PEEK:" + stack.peek());
//        System.out.println("IsEmpty:" + stack.isEmpty());
//        System.out.println("IsFull:" + stack.isFull());
//        stack.display();
//        System.out.println("POP:" + stack.pop());
//        System.out.println("PEEK:" + stack.peek());
//        System.out.println("IsEmpty:" + stack.isEmpty());
//        System.out.println("IsFull:" + stack.isFull());
//        stack.display();
//        System.out.println("POP:" + stack.pop());
//        System.out.println("PEEK:" + stack.peek());
//        System.out.println("IsEmpty:" + stack.isEmpty());
//        System.out.println("IsFull:" + stack.isFull());
//        stack.display();
//
        reverseTheInput();
    }

    private static void reverseTheInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            StackImpl stack = new StackImpl(line.length());
            System.out.println("INPUT:" + line);
            for (int i = 0; i < line.length(); i++) {
                System.out.println(line.charAt(i));
                stack.push(line.charAt(i));
            }
            System.out.println("==========OUTPUT===========");
            while (true) {
                char pop = stack.pop();
                if (pop != 0) {
                    System.out.println(pop);
                } else {
                    break;
                }
            }
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return stack[top];
        }

        return 0;
    }

    public void push(char val) {
        if (isFull()) {
            System.out.println("Unable to insert as stack is full");
        } else {
            stack[++top] = val;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            return 0;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= size - 1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
