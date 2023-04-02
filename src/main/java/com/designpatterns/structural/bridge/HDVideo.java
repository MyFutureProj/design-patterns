package com.designpatterns.structural.bridge;

/**
 * @author Ravi Panchal
 */
public class HDVideo implements VideoPlayer{
    @Override
    public void play(String videoFile) {
        System.out.println("Playing HD video of "+videoFile);
    }
}
