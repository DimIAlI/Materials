package org.example.Behavioral.Iterator;


public class Main {

    public static void main(String[] args) {
        ArrayCollection arrayCollection = new ArrayCollection(new String[]{"Какой", "-", "то", " ", "набор", " ", "слов", "!"});
        Iterator<String> iterator = arrayCollection.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
