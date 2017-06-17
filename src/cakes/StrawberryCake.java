package cakes;

import ingredients.Addition;
import ingredients.Cream;
import ingredients.SpongeCake;

public class StrawberryCake extends Cake {
    public StrawberryCake(CakeSize size) {
        this.name = "Tort truskawkowy";
        this.price = getPrice(size);
        this.size = size;
        this.ingredients.add(new Cream("krem truskawkowy"));
        this.ingredients.add(new Addition("truskawki"));
        this.ingredients.add(new SpongeCake("biały biszkopt"));
    }

    private static Double getPrice(CakeSize size) {
        switch(size) {
            case BIG:
                return 35.00;
            case MEDIUM:
                return 30.00;
            case SMALL:
                return 25.00;
            default:
                throw new IllegalArgumentException("Invalid cake size");
        }
    }
}
