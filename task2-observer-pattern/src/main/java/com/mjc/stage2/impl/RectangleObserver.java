package com.mjc.stage2.impl;


import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;



public class RectangleObserver implements Observer {

    // Write your code here!

    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        double side1 = rectangle.getSideA();
        double side2 = rectangle.getSideB();
        RectangleWarehouse.getInstance().put(rectangle.getId(),
                new RectangleValues(side1*side2, (side1+side2)*2));
    }

}