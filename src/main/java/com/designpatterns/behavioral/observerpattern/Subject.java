package com.designpatterns.behavioral.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravi Panchal
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void add(Observer observer) {
        observers.add(observer);
    }
}
