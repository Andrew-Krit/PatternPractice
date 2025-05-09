package Strategy;

public class SteamAccount extends Account
{
    public SteamAccount()
    {
        this._paymentStrategy = new PayPalPayment();
    }
}
