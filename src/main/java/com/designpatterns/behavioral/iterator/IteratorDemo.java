package com.designpatterns.behavioral.iterator;

/**
 * @author Ravi Panchal
 */
public class IteratorDemo {
    public static void main(String[] args) {
        String names[] = new String[]{"Apple", "Boat", "Cat", "Dog"};
        NameCollections nameCollectionsIterator = new NameCollections(names);
        Iterator iterator = nameCollectionsIterator.getIterator();
        while(iterator.hasNext()){
            System.out.println((String) iterator.next());
        }
    }
}
