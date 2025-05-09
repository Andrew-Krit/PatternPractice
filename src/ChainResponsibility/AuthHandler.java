package ChainResponsibility;

public class AuthHandler extends Handler
{
    public void handle(String request)
    {
        if(request.equals("auth"))
        {
            System.out.println("Обработка авторизации");
        }
        else
        {
            super.handle(request);
        }
    }
}
