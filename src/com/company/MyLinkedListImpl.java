package com.company;

/**
 * Created by mohammedshinoy on 2016-09-22.
 */
public class MyLinkedListImpl <T> implements MyLinkedList {

    LinkedListNode head;

    @Override
    public void enqueue(Object data) {

        //LinkedListNode temp = head;
        LinkedListNode newLinkedListNode = new LinkedListNode(data);
        if (head == null) {
            head = newLinkedListNode;
        } else {
            LinkedListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newLinkedListNode;
            newLinkedListNode.data = data;
        }
    }

    @Override
    public Object dequeue() throws Exception{
        LinkedListNode temp = head;
        if (head == null){
            throw new Exception("Head is empty");
        }
        head = head.next;
        temp.next = null;
        return temp.data;
    }

    @Override
    public Object peek() throws Exception{

        if (head == null) {
            throw new Exception("Head is empty");
        }
        return head.data;
    }
    @Override
    public void reverseLinkedList() throws Exception{
        LinkedListNode pointer = head;
        LinkedListNode temp = head;
        if (head == null){
            throw new Exception("Head is empty");
        }else {
            while (head.next != null) {
                head = head.next;
            }

            LinkedListNode reverser = head;
            while (reverser != temp) {
                while (temp.next != reverser) {

                    temp = temp.next;
                }
                reverser.next = temp;
                reverser = temp;
                temp = pointer;
            }

        }
        temp.next = null;
    }

//    @Override
//    public int CompareLists(MyLinkedList headA, MyLinkedList headB) {
//        MyLinkedList tempA = headA;
//        MyLinkedList tempB = headB;
//
//        tempA =
//
//        if(headA.data != headB.data){
//            return 0;
//        }
//
//        while((tempA.next!=null) && (tempB.next != null)){
//            if(tempA.data == tempB.data){
//                tempA = tempA.next;
//                tempB = tempB.next;
//            }else
//            {
//                return 0;
//            }
//
//        }
//        if ((tempA.next == null) && (tempB.next == null)){
//            return 1;
//        }
//        else
//        {
//            return 0;
//        }
//    }
}
