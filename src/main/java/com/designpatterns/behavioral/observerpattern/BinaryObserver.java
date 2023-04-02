package com.designpatterns.behavioral.observerpattern;

/**
 * @author Ravi Panchal
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
    }
}
