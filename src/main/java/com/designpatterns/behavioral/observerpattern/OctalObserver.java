package com.designpatterns.behavioral.observerpattern;

/**
 * @author Ravi Panchal
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+Integer.toOctalString(subject.getState()));
    }
}
