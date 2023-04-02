package com.designpatterns.behavioral.commandpattern;

/**
 * @author Ravi Panchal
 */
public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
