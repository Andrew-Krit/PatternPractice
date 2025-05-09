package Strategy;

public class CreditCardPayment implements PaymentStrategy
{
    public void pay(double amount)
    {
        System.out.printf("Оплата %s c помощью кредитной карты \n", amount);
    }
}
