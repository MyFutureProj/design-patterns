package com.designpatterns.behavioral.commandpattern;

/**
 * @author Ravi Panchal
 */
public class CommandDemo {
    public static void main(String[] args) {
        TextFileOperationInvoker textFileOperationInvoker = new TextFileOperationInvoker();
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("text.txt"));
        System.out.println(textFileOperationInvoker.executeOperation(openTextFileOperation));

        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("text1.txt"));
        System.out.println(textFileOperationInvoker.executeOperation(saveTextFileOperation));
    }
}
