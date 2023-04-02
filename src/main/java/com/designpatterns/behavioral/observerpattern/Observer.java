package com.designpatterns.behavioral.observerpattern;

/**
 * @author Ravi Panchal
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
