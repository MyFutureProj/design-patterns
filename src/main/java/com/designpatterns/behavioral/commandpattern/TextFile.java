package com.designpatterns.behavioral.commandpattern;

/**
 * @author Ravi Panchal
 */

//Receiver
public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open(){
        return "Opening File: "+name;
    }

    public String save(){
        return "Saving File: "+name;
    }
}
