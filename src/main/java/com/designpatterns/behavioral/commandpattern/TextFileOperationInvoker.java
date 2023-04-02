package com.designpatterns.behavioral.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravi Panchal
 */
public class TextFileOperationInvoker {
    private final List<TextFileOperation> textFileOperationsList = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation){
        textFileOperationsList.add(textFileOperation);
        return textFileOperation.execute();
    }
}
