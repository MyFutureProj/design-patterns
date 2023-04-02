package com.designpatterns;

import com.designpatterns.creational.builderpattern.Burger;
import com.designpatterns.creational.singletonpattern.SingletonDemo;

import java.io.*;

/**
 * @author Ravi Panchal
 * Reference: https://www.digitalocean.com/community/tags/design-patterns
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        testBuilder();
        testSingleton();

    }

    private static void testSingleton() throws IOException, ClassNotFoundException {

        /*
           Singleton Pattern
        */

        SingletonDemo singletonObj1 = SingletonDemo.getInstance();
        System.out.println("singleton Obj1 Hashcode : "+singletonObj1.hashCode());
        SingletonDemo singletonObj2 = SingletonDemo.getInstance();
        System.out.println("singleton Obj2 Hashcode : "+singletonObj2.hashCode());

        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("out.ser"));
        objectOutput.writeObject(singletonDemo);
        objectOutput.close();
        System.out.println("Serialized Singleton Hashcode: "+singletonDemo.hashCode());

        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("out.ser"));
        SingletonDemo singletonDemo1 = (SingletonDemo) objectInput.readObject();
        objectInput.close();
        System.out.println("De-Serialized Singleton Hashcode: "+singletonDemo1.hashCode());

    }

    private static void testBuilder() {
        /*
            Builder Pattern
        */
        Burger burger = new Burger.BurgerBuilder()
                .setSize("L")
                .setMeyo(true)
                .setCheese(true)
                .setPeriperi(false)
                .build();
        System.out.println(burger.toString());
    }
}