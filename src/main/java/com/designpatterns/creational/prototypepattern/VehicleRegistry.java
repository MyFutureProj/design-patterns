package com.designpatterns.creational.prototypepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ravi Panchal
 */
public class VehicleRegistry {

    private static Map<String, Vehicle> vehicleMap = new HashMap<>();

    static {
        vehicleMap.put("TWO_WHEEL", new TwoWheeler("150cc","Sp100",100000L, false));
        vehicleMap.put("FOUR_WHEEL", new FourWheeler("1200cc","xz",8500000, false, true));
    }

    public Vehicle getVehicle(String type) throws CloneNotSupportedException {
        if(vehicleMap.containsKey(type)) {
            return vehicleMap.get(type).clone();
        }
        return null;
    }

}
