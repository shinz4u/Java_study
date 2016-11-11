package com.company;

/**
 * Created by mohammedshinoy on 2016-09-22.
 */
public class StackImpl {

    private Integer[] stack;
    private int size = 10;
    private int top;

    public StackImpl(){
        stack = new Integer[size];
        top = -1;
    }

    public void push(Integer object) throws FullStackException{
        if(!isfull()){
            top++;
            stack[top] = object;
        }else {
            String e = "StackImpl is full";
            throw new FullStackException(e);
        }
    }

    public Integer pop() throws EmptyStackException {
        if (!isEmpty()) {
            Integer temp = stack[top];
            stack[top] = null;
            top--;
            return temp;
        }
        String e = "StackImpl is Empty";
        throw new EmptyStackException(e);
    }

    public Integer seek() throws  EmptyStackException{
        if (isEmpty()){
            String e = " StackImpl is Empty No Elements to seek";
            throw new EmptyStackException(e);
        }
        return stack[top];
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
        StackImpl stacktest = new StackImpl();

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
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());
        System.out.println(stacktest.pop());


        }
    }



