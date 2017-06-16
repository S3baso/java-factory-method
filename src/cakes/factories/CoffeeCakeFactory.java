package cakes.factories;

import cakes.*;

public class CoffeeCakeFactory implements CakeFactoryInterface {
    @Override
    public Cake createBigCake() {
        return new BigCofeeCake();
    }

    @Override
    public Cake createMediumCake() {
        return new MediumCofeeCake();
    }

    @Override
    public Cake createSmallCake() {
        return new SmallCoffeeCake();
    }
}
