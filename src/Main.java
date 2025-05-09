import ChainResponsibility.AuthHandler;
import ChainResponsibility.Handler;
import ChainResponsibility.LogHandler;
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

        Handler h1 = new AuthHandler();
        Handler h2 = new LogHandler();
        h1.setNext(h2);
        h1.handle("auth");
        h1.handle("log");
    }
}