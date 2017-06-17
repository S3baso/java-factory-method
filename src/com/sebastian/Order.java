package com.sebastian;

import java.util.ArrayList;
import cakes.CakeSize;
import cakes.CakeType;
import cakes.Cake;
import cakes.factories.CakeFactory;

public class Order {
    public Cake cake;
    public int count;

    /**
     *
     * @param type - Type of cake
     * @param size - Size of cake
     * @param count - Number of cakes to order
     */
    public Order(CakeType type, CakeSize size, int count)
    {
        this.cake = CakeFactory.create(size, type);
        this.count = count;
    }

    public void summary()
    {
        System.out.println("Podsumowanie twojego zamówienia: ");
        System.out.printf("%d x %s \n \n", this.count, this.cake);
        System.out.println("Do zapłaty: " + (this.count * this.cake.getPrice()) + " PLN");
    }
}
