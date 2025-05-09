package Strategy;

public class Account
{
    protected PaymentStrategy _paymentStrategy;

    public void pay(double amount)
    {
        _paymentStrategy.pay(amount);
    }
}
