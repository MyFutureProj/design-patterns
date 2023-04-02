package com.designpatterns.structural.adaptor;

/**
 Adapter:
 Allows two incompatible interfaces to work
 together by wrapping an adapter class
 around one of the interfaces. This adapter
 class converts the interface of the adapted
 class into the interface that the client is
 expecting.

 • Adapters can not only convert data into
 various formats but can also help
 objects with different interfaces
 collaborate.
 • Possible to create a two-way adapter
 that can convert the calls in both
 directions.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        EVEngineAdapter evEngineAdapter = new EVEngineAdapter(new NexonEV());
        evEngineAdapter.fuel();
        evEngineAdapter.engine();
        evEngineAdapter.mileage();
        evEngineAdapter.speed();
    }
}
