package edu.greenriver.sdev333;

import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList<ItemType> implements List<ItemType>{

    // Fields

    private ItemType[] data;
    // int to keep track of spots used in data array
    // size is different than length
    private int size;

    public ArrayList(){
        size = 0;
        data = (ItemType[]) new Object[10];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(ItemType item) {
        return false;
    }

    @Override
    public Iterator<ItemType> iterator() {
        return new OurCustomIterator();
    }

    @Override
    public void add(ItemType item) {
        if (size == data.length){
            // resize up

            // Step 1 - create a new larger array
            ItemType[] temp = (ItemType[]) new Object[size * 2];

            // Step 2 - copy items from data to temp
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }

            // Step 3 - repoint data to point to new array
            data = temp;
        }
        data[size] = item;
        size++;
    }

    @Override
    public void remove(ItemType item) {

    }

    @Override
    public void clear() {
        // lazy deletion
        size = 0;
    }

    @Override
    public boolean containsAll(Collection<? extends ItemType> otherCollection) {
        // fail fast (Ken: fail loud)
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void addAll(Collection<? extends ItemType> otherCollection) {

    }

    @Override
    public void removeAll(Collection<? extends ItemType> otherCollection) {

    }

    @Override
    public void retainAll(Collection<? extends ItemType> otherCollection) {

    }

    @Override
    public ItemType get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("index is beyond size");
        }
        return data[index];
    }

    @Override
    public void set(int index, ItemType item) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("index is beyond size");
        }
        data[index] = item;
    }

    @Override
    public void add(int index, ItemType item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexOf(ItemType item) {
        return 0;
    }

    @Override
    public int lastIndexOf(ItemType item) {
        return 0;
    }

    @Override
    public ListIterator<ItemType> listIterator() {
        return null;
    }

    private class OurCustomIterator implements Iterator<ItemType>{
        // fields
        private int currentPosition;

        public OurCustomIterator() {
            currentPosition = 0;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < size();
        }

        @Override
        public ItemType next() {
            ItemType result = get(currentPosition);
            currentPosition++;
            return result;
        }
    }

    private class SecondCustomIterator implements ListIterator<ItemType> {
        private int currentPosition;

        public SecondCustomIterator() {
            currentPosition = 0;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < size();
        }

        @Override
        public ItemType next() {
            ItemType result = get(currentPosition);
            currentPosition++;
            return result;
        }

        @Override
        public boolean hasPrevious() {
            return currentPosition < 0;
        }

        @Override
        public ItemType previous() {
            currentPosition--;
            ItemType result = get(currentPosition);
            return result;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(ItemType itemType) {

        }

        @Override
        public void add(ItemType itemType) {

        }
    }
}
