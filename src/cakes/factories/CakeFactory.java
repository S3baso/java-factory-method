package cakes.factories;

import cakes.*;

public class CakeFactory {

    /**
     *
     * @param size - cake size
     * @param type - cake type
     * @return Cake
     * @throws IllegalArgumentException
     */
    public static Cake create(CakeSize size, CakeType type) throws IllegalArgumentException {
        switch(type) {
            case CHOCOLATE:
                return new ChocolateCake(size);
            case STRAWBERRY:
                return new StrawberryCake(size);
            case COFFEE:
                return new CoffeeCake(size);
            default:
                throw new IllegalArgumentException("Invalid cake type");
        }
    }

}
