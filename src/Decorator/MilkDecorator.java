package Decorator;

public class MilkDecorator extends CoffeeDecorator
{
    public MilkDecorator(Coffee coffe)
    {
        super(coffe);
    }

    public String getDescription()
    {
        return super.getDescription() + ", с молоком";
    }

   public double getCost()
   {
       return super.getCost() + 1.5;
   }
}
