package cakes;

import ingredients.Addition;
import ingredients.Cream;
import ingredients.SpongeCake;

public class CoffeeCake extends Cake {
    public CoffeeCake(CakeSize size) {
        this.name = "Tort kawowy";
        this.price = getPrice(size);
        this.size = size;
        this.ingredients.add(new Cream("krem kawowy"));
        this.ingredients.add(new Addition("ziarna kawy"));
        this.ingredients.add(new SpongeCake("biały biszkopt"));
    }

    private static Double getPrice(CakeSize size) {
        switch(size) {
            case BIG:
                return 32.00;
            case MEDIUM:
                return 27.00;
            case SMALL:
                return 22.00;
            default:
                throw new IllegalArgumentException("Invalid cake size");
        }
    }
}
