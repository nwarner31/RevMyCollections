package com.revature.nwarner.collections;

public class MyArrayList {
    private Object[] collection;
    private int size;

    public MyArrayList() {
        collection = new Object[10];
        size = 0;
    }

    /**
     * Adds an item to the end of the ArrayList.
     * @param o The object to the added to the ArrayList.
     */
    public void addItem(Object o) {
        if(isArrayFull()) {
            increaseArraySize();
        }

    }

    private Boolean isArrayFull() {
        return size == collection.length;
    }

    private void increaseArraySize() {
        Object[] tempArray = new Object[size + 10];
        for(int index = 0; index < size; index++) {
            tempArray[index] = collection[index];
        }
        collection = tempArray;
    }

}
