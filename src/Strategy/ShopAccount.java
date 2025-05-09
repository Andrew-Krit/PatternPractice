package Strategy;

public class ShopAccount extends Account
{
    public ShopAccount()
    {
        this._paymentStrategy = new CreditCardPayment();
    }
}
