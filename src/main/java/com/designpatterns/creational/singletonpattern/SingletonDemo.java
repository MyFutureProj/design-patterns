package com.designpatterns.creational.singletonpattern;

import java.io.Serializable;

/**
 * @author Ravi Panchal
 */
public class SingletonDemo implements Serializable, Cloneable {

    private static SingletonDemo instance;

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
