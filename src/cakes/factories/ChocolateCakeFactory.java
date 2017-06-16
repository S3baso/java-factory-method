package cakes.factories;

import cakes.*;

public class ChocolateCakeFactory implements CakeFactoryInterface {

    @Override
    public Cake createBigCake() {
        return new BigChocolateCake();
    }

    @Override
    public Cake createMediumCake() {
        return new MediumChocolateCake();
    }

    @Override
    public Cake createSmallCake() {
        return new SmallChocolateCake();
    }
}
