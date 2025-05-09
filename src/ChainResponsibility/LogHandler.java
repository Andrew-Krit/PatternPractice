package ChainResponsibility;

public class LogHandler extends Handler
{
    public void handle(String request)
    {
        if(request.equals("log"))
        {
            System.out.println("Обработка логирования");
        }
        else
        {
            super.handle(request);
        }
    }
}
