package com.revature.nwarner.collections;



public class MyDoubleLinkList {

    private MyDoubleLinkListNode head;
    private MyDoubleLinkListNode tail;

    private class MyDoubleLinkListNode {
        private Object myValue;
        private MyDoubleLinkListNode previousNode;
        private MyDoubleLinkListNode nextNode;

        private MyDoubleLinkListNode(Object value, MyDoubleLinkListNode previous, MyDoubleLinkListNode next) {
            this.myValue = value;
            this.previousNode = previous;
            this.nextNode = next;
        }
    }

    /**
     * Inserts an object at the front of the linked list.
     * @param o The object to be inserted.
     */
    public void push(Object o) {
        MyDoubleLinkListNode node = new MyDoubleLinkListNode(o, null, head);
        if (head != null) {
            head.previousNode = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }

    }

    /**
     * Inserts an object at the back of the linked list.
     * @param o The object to be inserted.
     */
    public void add(Object o) {
        MyDoubleLinkListNode node = new MyDoubleLinkListNode(o, tail, null);
        if (tail != null) {
            tail.nextNode = node;
        }

        tail = node;
        if (head == null) {
            head = node;
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
