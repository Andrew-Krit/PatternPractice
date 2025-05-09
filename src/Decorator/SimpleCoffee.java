package Decorator;

public class SimpleCoffee implements Coffee
{
    public String getDescription()
    {
        return "Обычный кофе";
    }

    public double getCost()
    {
        return 5.0;
    }
}
