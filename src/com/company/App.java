package com.company;

/**
 * Created by mohammedshinoy on 2016-09-22.
 */
public class App {
    public static void main(String args[]) throws Exception {
        MyLinkedList<Integer> list = new MyLinkedListImpl<>();
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);
        list.enqueue(6);
        list.enqueue(7);
        list.enqueue(8);
        list.enqueue(9);
        list.reverseLinkedList();

        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());

        System.out.println(" Guess This shit is working");

        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());




    }
}
