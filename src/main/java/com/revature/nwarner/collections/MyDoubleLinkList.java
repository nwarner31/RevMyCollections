package com.revature.nwarner.collections;



public class MyDoubleLinkList <T> {

    private MyDoubleLinkListNode <T> head;
    private MyDoubleLinkListNode <T> tail;

    private class MyDoubleLinkListNode <T> {
        private T myValue;
        private MyDoubleLinkListNode <T> previousNode;
        private MyDoubleLinkListNode <T> nextNode;

        private MyDoubleLinkListNode(T value, MyDoubleLinkListNode <T> previous, MyDoubleLinkListNode <T> next) {
            this.myValue = value;
            this.previousNode = previous;
            this.nextNode = next;
        }
    }

    /**
     * Inserts an object at the front of the linked list.
     * @param t The object to be inserted.
     */
    public void push(T t) {
        MyDoubleLinkListNode node = new MyDoubleLinkListNode(t, null, head);
        if (head != null) {
            head.previousNode = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
    }

    public T pop() {
        if(head != null) {
            T value = head.myValue;
            head = head.nextNode;
            return value;
        } else {
            return null;
        }

    }

    /**
     * Inserts an object at the back of the linked list.
     * @param t The object to be inserted.
     */
    public void add(T t) {
        MyDoubleLinkListNode node = new MyDoubleLinkListNode(t, tail, null);
        if (tail != null) {
            tail.nextNode = node;
        }

        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public T remove() {
        if(tail!=null) {
            T value = tail.myValue;
            tail = tail.previousNode;
            return value;
        } else {
            return null;
        }
    }

    public void printForward() {
        MyDoubleLinkListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.myValue);
            currentNode = currentNode.nextNode;
        }
    }

    public void printBackwards() {
        MyDoubleLinkListNode currentNode = tail;
        while (currentNode != null) {
            System.out.println(currentNode.myValue);
            currentNode = currentNode.previousNode;
        }
    }
}
