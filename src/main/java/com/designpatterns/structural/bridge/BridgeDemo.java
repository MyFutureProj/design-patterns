package com.designpatterns.structural.bridge;

/**
 Bridge
 Allows for the separation of abstraction and
 implementation, so that the two can vary independently.

 • Abstractions and implementations
 should not be bound at compile time.
 • Abstractions and implementations
 should be independently extensible.
 • Changes in the implementation of an
 abstraction should have no impact on
 clients.
 • Implementation details should be
 hidden from the client.

 */
public class BridgeDemo {
    public static void main(String[] args) {
        Youtube youtube = new Youtube(new HDVideo());
        youtube.processVideo("Dance India Dance");

        Netflix netflix = new Netflix(new SDVideo());
        netflix.processVideo("Mission Impossible");
    }
}
