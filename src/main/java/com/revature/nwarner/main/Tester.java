package com.revature.nwarner.main;

import com.revature.nwarner.collections.MyArrayList;

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

    }
}
