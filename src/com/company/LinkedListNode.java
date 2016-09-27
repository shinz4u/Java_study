package com.company;

/**
 * Created by mohammedshinoy on 2016-09-22.
 */
public class LinkedListNode <T> {
    T data;
    LinkedListNode next;

    public LinkedListNode(T value) {
        this.data = value;
        this.next = null;
    }
}