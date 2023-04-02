package com.designpatterns.behavioral.iterator;

/**
 * @author Ravi Panchal
 */
public class NameCollectionsIterator implements Iterator {

    private final String[] nameCollection;
    private int count = 0;

    NameCollectionsIterator(String[] nameCollection) {
        this.nameCollection = nameCollection;
    }

    @Override
    public boolean hasNext() {
        return count < nameCollection.length;
    }

    @Override
    public Object next() {
        if (this.hasNext())
            return nameCollection[count++];
        else
            return null;
    }
}
