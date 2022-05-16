package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack stack = new Stack(5);
        System.out.println("Length = " + stack.length() );
        stack.push(5);
        stack.push(4);
        stack.push(3);
        System.out.println("Pop = " + stack.pop() );
        System.out.println("Pop = " + stack.pop() );
        System.out.println("Pop = " + stack.pop() );
        System.out.println("Pop = " + stack.pop() );
        stack.push(5);
        System.out.println("Pop = " + stack.pop() );

    }
}

class Stack {
    private int arr[];
    int pos = 0;

    Stack(int capacity) {
        arr = new int[capacity];
    }

    int length() {
        return arr.length;
    }

    void push(int value) {
        arr[pos] = value;
        ++pos;
    }

    int pop() {
//        System.out.println(pos);
        if(pos == 0) {
            return -1;
        }
        int val = arr[--pos];
        arr[pos] = 0;
//        System.out.println(pos);
        return val;
    }
}
