package Strategy;

public class PayPalPayment implements PaymentStrategy
{
    public void pay(double amount)
    {
        System.out.printf("Оплата %s через PayPal \n", amount);
    }
}
