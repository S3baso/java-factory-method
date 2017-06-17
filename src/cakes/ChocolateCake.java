package cakes;

import ingredients.Cream;
import ingredients.SpongeCake;
import ingredients.Topping;

public class ChocolateCake extends Cake {
    public ChocolateCake(CakeSize size) {
        this.name = "Tort czekoladowy";
        this.price = getPrice(size);
        this.size = size;
        this.ingredients.add(new Cream("krem czekoladowy"));
        this.ingredients.add(new Topping("polewa czekoladowa"));
        this.ingredients.add(new SpongeCake("ciemny biszkopt"));
    }

    private static Double getPrice(CakeSize size) {
        switch(size) {
            case BIG:
                return 30.00;
            case MEDIUM:
                return 25.00;
            case SMALL:
                return 20.00;
            default:
                throw new IllegalArgumentException("Invalid cake size");
        }
    }
}
