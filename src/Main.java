import Adapter.AudioPlayer;
import Builder.Employee;
import ChainResponsibility.AuthHandler;
import ChainResponsibility.LogHandler;
import Decorator.Coffee;
import Decorator.MilkDecorator;
import Decorator.SimpleCoffee;
import Proxy.ProxyService;
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

        var h1 = new AuthHandler();
        var h2 = new LogHandler();
        h1.setNext(h2);
        h1.handle("auth");
        h1.handle("log");

        var employee = new Employee.EmployeeBuilder("EmployeeName","EmployeeCompany").setHasBike(false).setHasCar(true).build();

        var service = new ProxyService();
        service.request();

        Coffee coffee = new SimpleCoffee();
        MilkDecorator milkDecorator = new MilkDecorator(coffee);

        System.out.println(milkDecorator.getDescription());

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("avi", "film.avi");
    }
}