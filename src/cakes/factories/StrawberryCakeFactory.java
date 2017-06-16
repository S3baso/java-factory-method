package cakes.factories;

import cakes.*;

public class StrawberryCakeFactory implements CakeFactoryInterface {
    @Override
    public Cake createBigCake() {
        return new BigStrawberryCake();
    }

    @Override
    public Cake createMediumCake() {
        return new MediumStrawberryCake();
    }

    @Override
    public Cake createSmallCake() {
        return new SmallStrawberryCake();
    }
}