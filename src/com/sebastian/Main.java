package com.sebastian;

import cakes.factories.CakeFactory;
import cakes.CakeSize;
import cakes.CakeType;
import cakes.Cake;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(CakeType.CHOCOLATE, CakeSize.BIG, 3);
        // TODO: Brakuje opcji dostawy
        order.summary();
    }
}
