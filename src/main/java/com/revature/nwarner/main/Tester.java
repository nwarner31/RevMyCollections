package com.revature.nwarner.main;

import com.revature.nwarner.collections.MyArrayList;
import com.revature.nwarner.collections.MyDoubleLinkList;

public class Tester {

    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();

        for(int x = 0; x < 15; x++) {
            mal.addItem(x);
        }

        mal.insertItem(20, 6);
        mal.removeItem(10);

        for(int x = 0; x < mal.getSize(); x++) {
            System.out.println(mal.getItem(x));
        }

        MyDoubleLinkList mdll = new MyDoubleLinkList();

        for(int x = 0; x < 5; x++) {
            mdll.push(x);
        }
        for(int x = 100; x < 104; x++) {
            mdll.add(x);
        }
        System.out.println("Forward");
        mdll.printForward();

        System.out.println("Backwards");
        mdll.printBackwards();
    }
}
