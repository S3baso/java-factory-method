package cakes;

import java.util.ArrayList;
import ingredients.Ingredient;

public abstract class Cake {
    protected String name;
    protected ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    protected Double price;
    protected CakeSize size;

    public String getName()
    {
        return this.name;
    }

    public Double getPrice()
    {
        return this.price;
    }

    public CakeSize getSize()
    {
        return this.size;
    }

    @Override
    public String toString()
    {
        return this.size + " " + this.name + " " + this.ingredients + " - " + this.price + " PLN";
    }
}
