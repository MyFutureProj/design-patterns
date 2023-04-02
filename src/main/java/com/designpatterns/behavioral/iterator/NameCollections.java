package com.designpatterns.behavioral.iterator;

/**
 * @author Ravi Panchal
 */
public class NameCollections implements  Container{

    private String names[];

    public NameCollections(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameCollectionsIterator(names);
    }
}
