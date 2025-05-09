import Strategy.ShopAccount;
import Strategy.SteamAccount;

public class Main
{
    public static void main(String[] args)
    {
        var steamAccount = new SteamAccount();
        var shopAccount = new ShopAccount();

        steamAccount.pay(25.35);
        shopAccount.pay(30.10);
    }
}