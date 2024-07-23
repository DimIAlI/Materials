package org.example.Behavioral.Iterator;

public class ArrayCollection implements Iterable<String> {

    String[] collection;

    public ArrayCollection(String[] collection) {
        this.collection = collection;
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<String> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < collection.length;
        }

        @Override
        public String next() {
            return collection[index++];
        }
    }
}
