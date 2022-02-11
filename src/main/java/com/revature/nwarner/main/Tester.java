package com.revature.nwarner.main;

import com.revature.nwarner.collections.MyArrayList;
import com.revature.nwarner.collections.MyDoubleLinkList;

public class Tester {

    public static void main(String[] args) {
        MyArrayList<Integer> mal = new MyArrayList<>();

        for(int x = 0; x < 15; x++) {
            mal.addItem(x);
        }

        mal.insertItem(20, 6);
        mal.removeItem(10);
        System.out.println(String.format("The item is at index: %s", mal.findItem(12)));
        mal.updateItem(20, 2);

        for(int x = 0; x < mal.getSize(); x++) {
            System.out.println(mal.getItem(x));
        }

        MyArrayList<Integer> mal2 = new MyArrayList<>();
        mal2.addItem(6);
        MyArrayList<Integer> mal3 = new MyArrayList<>();
        mal3.addItem(60);
        MyArrayList<Integer> mal4 = new MyArrayList<>();
        mal4.addItem(60);
        for(int i : mal.findAllInstances(20)) {
            System.out.println(String.format("Found at index: %s", i));
        }
        System.out.println(String.format("Mal2 subset of mal: %s", mal2.isSubsetOf(mal)));
        System.out.println(String.format("Mal3 subset of mal: %s", mal3.isSubsetOf(mal)));
        System.out.println(String.format("Mal4 is equal to mal3: %s", mal4.isEqualTo(mal3)));
        System.out.println(String.format("Mal4 is equal to mal2: %s", mal4.isEqualTo(mal2)));


        MyDoubleLinkList<Integer> mdll = new MyDoubleLinkList<>();

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
