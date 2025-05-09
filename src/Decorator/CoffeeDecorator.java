package Decorator;

public abstract class CoffeeDecorator implements Coffee
{
    protected Coffee _decoratedCoffe;

    public CoffeeDecorator(Coffee coffe)
    {
        this._decoratedCoffe = coffe;
    }

    public String getDescription()
    {
        return _decoratedCoffe.getDescription();
    }

    public double getCost()
    {
        return _decoratedCoffe.getCost();
    }
}
