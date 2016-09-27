package com.company;

import java.util.EmptyStackException;
import java.util.StringJoiner;

/**
 * Created by mohammedshinoy on 2016-09-22.
 */
public class Stack {

    private Integer[] stack;
    private int size = 10;
    private int top;

    public Stack(){
        stack = new Integer[size];
        top = -1;
    }

    public void push(Integer object) throws FullStackException{
        if(!isfull()){
            if (isEmpty()){
                top = top + 1;
            }
            stack[top] = object;
            top = top + 1;

        }else {
            String e = "Stack is full";
            throw new FullStackException(e);
        }
    }

    public Integer pop() throws EmptyStackException {
        if (!isEmpty()) {
            Integer temp = stack[top - 1];
            stack[top-1] = null;
            top = top - 1;
            return temp;

        }
        String e = "Stack is Empty";
        throw new EmptyStackException(e);
    }

    public Integer seek() throws  EmptyStackException{
        if (isEmpty()){
            String e = " Stack is Empty No Elements to seek";
            throw new EmptyStackException(e);
        }
        return stack[top-1];
    }

    public boolean isfull(){
        if (top == size){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }

    public class EmptyStackException extends Exception
    {
        //Parameterless Constructor
        public EmptyStackException() {}

        //Constructor that accepts a message
        public EmptyStackException(String message)
        {
            System.out.println(message);
        }
    }

    public class FullStackException extends Exception
    {
        //Parameterless Constructor
        public FullStackException() {}

        //Constructor that accepts a message
        public FullStackException(String message)
        {
            System.out.println(message);


        }
    }

    public static void main(String[] args) throws FullStackException,EmptyStackException {
        Stack stacktest = new Stack();

        stacktest.push(1);
        System.out.println(stacktest.pop());
        stacktest.push(1);
        stacktest.push(2);
        stacktest.push(3);
        stacktest.push(4);
        stacktest.push(5);
        stacktest.push(6);
        stacktest.push(7);
        stacktest.push(8);
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());
        stacktest.push(9);
        stacktest.push(10);
        stacktest.push(11);
        stacktest.push(12);
        stacktest.push(13);
        stacktest.push(14);
        System.out.println(stacktest.seek());
        stacktest.push(4);
        stacktest.push(5);
        stacktest.push(6);
        stacktest.push(7);



        }
    }



