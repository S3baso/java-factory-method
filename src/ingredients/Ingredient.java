package ingredients;

public abstract class Ingredient {
    protected String name;

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
