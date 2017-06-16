package com.sebastian;

import cakes.BigChocolateCake;
import cakes.Cake;
import cakes.factories.CakeFactory;

public class Main {
    public static void main(String[] args) {
        try {
            Cake test = CakeFactory.create("big", "coffee");
            System.out.println(test.name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
