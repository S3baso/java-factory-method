package cakes.factories;

import cakes.*;

public class CakeFactory {

    /**
     *
     * @param size - cake size
     * @param type - cake type
     * @return Cake
     * @throws Exception
     */
    public static Cake create(String size, String type) throws Exception {
        if (size.equals("big")) {
            if (type.equals("strawberry"))
                return new BigStrawberryCake();
            if (type.equals("chocolate"))
                return new BigChocolateCake();
            if (type.equals("coffee"))
                return new BigCoffeeCake();

            throw new Exception("Invalid cake type");
        }

        if (size.equals("medium")) {
            if (type.equals("strawberry"))
                return new MediumStrawberryCake();
            if (type.equals("chocolate"))
                return new MediumChocolateCake();
            if (type.equals("coffee"))
                return new MediumCoffeeCake();

            throw new Exception("Invalid cake type");
        }

        if (size.equals("small")) {
            if (type.equals("strawberry"))
                return new SmallStrawberryCake();
            if (type.equals("chocolate"))
                return new SmallChocolateCake();
            if (type.equals("coffee"))
                return new SmallCoffeeCake();

            throw new Exception("Invalid cake type");
        }

        throw new Exception("Invalid size");
    }

}
