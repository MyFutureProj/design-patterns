package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ravi Panchal
 */
public class ShapeFactory {

    private static final Map<String, Circle> circleMap = new HashMap<>();

    public Shape getCircle(String colour){
        Circle circle = null;
        if(circleMap.containsKey(colour)){
            circle = circleMap.get(colour);
            return circle;
        }else{
            circle = new Circle(colour);
            circleMap.put(colour, circle);
            return circle;
        }
    }
}
