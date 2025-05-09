package Proxy;

public class ProxyService implements Service
{
    private RealService _realService;

    public void request()
    {
        if(_realService == null)
        {
            _realService = new RealService();
        }
        System.out.println("Проверка доступа...");
        _realService.request();
    }
}
