package com.designpatterns.structural.adaptor;

/**
 * @author Ravi Panchal
 */
public class EVEngineAdapter implements Engine{

    private EV ev;

    public EVEngineAdapter(EV ev){
        this.ev = ev;
    }


    @Override
    public void engine() {
        ev.electricMotor();
    }

    @Override
    public void fuel() {
        ev.electricity();
    }

    @Override
    public void mileage() {
        ev.mileage();
    }

    @Override
    public void speed() {
        ev.speed();
    }
}
