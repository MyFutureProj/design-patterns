package com.designpatterns.structural.bridge;

/**
 * A Bridge Pattern says that just "decouple the functional abstraction from the implementation so that the two can vary independently".
 *
 * @author Ravi Panchal
 */
public class SDVideo implements VideoPlayer{
    @Override
    public void play(String videoFile) {
        System.out.println("Playing SD video of "+videoFile);
    }
}
