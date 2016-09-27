package com.company;

/**
 * Created by mohammedshinoy on 2016-09-22.
 */
public interface MyLinkedList <T> {
    void enqueue(T data);
    T dequeue() throws Exception;
    T peek() throws Exception;
    void reverseLinkedList() throws Exception;
    //int compareList();
}
