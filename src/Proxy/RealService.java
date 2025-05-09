package Proxy;

public class RealService implements Service
{
    public void request()
    {
        System.out.println("Выполнение запроса к реальному сервису");
    }
}
