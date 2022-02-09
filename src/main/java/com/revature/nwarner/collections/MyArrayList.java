package com.revature.nwarner.collections;

public class MyArrayList {
    private Object[] collection;
    private int size;

    public MyArrayList() {
        collection = new Object[10];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    /**
     * Adds an item to the end of the ArrayList.
     * @param o The object to the added to the ArrayList.
     */
    public void addItem(Object o) {
        if(isArrayFull()) {
            increaseArraySize();
        }
        collection[size] = o;
        size++;
    }

    /**
     * Inserts an object in the ArrayList at the position provided.
     * @param o The object to be inserted
     * @param index The index where the object will be inserted
     */
    public void insertItem(Object o, int index) {
        if(isArrayFull()) {
            increaseArraySize();
        }
        if(isIndexValid(index)) {
            for(int i = size - 1; i >= index; i--) {
                collection[i + 1] = collection[i];
            }
            collection[index] = o;
            size++;
        }

    }


    /**
     * Returns the object at the index
     * @param index The index of the object to be returned
     * @return The object at the index or null if the index is invalid.
     */
    public Object getItem(int index) {
        if(isIndexValid(index)) {
            return collection[index];
        }
        return null;
    }

    /**
     * Removes the object at the given index
     * @param index The index of the object to remove.
     */
    public void removeItem(int index) {
        if(isIndexValid(index)) {
            for(int i = index; i < size; i++) {
                collection[i] = collection[i + 1];
            }
            size--;
        }
    }

    private Boolean isArrayFull() {
        return size == collection.length;
    }

    /**
     * Tests to see if the index provided is within the range of the array's values.
     * @param index The index being tested.
     * @return True if the value is in the range of the array. False if not.
     */
    private Boolean isIndexValid(int index) {
        return index > -1 && index < size;
    }

    /**
     * Increases the size of the array by 10 if the array is full.
     */
    private void increaseArraySize() {
        Object[] tempArray = new Object[size + 10];
        for(int index = 0; index < size; index++) {
            tempArray[index] = collection[index];
        }
        collection = tempArray;
    }



}
