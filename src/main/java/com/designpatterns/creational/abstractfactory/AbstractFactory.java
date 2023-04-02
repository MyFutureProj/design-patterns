package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public interface AbstractFactory<T> {
    T create(String type);
}
