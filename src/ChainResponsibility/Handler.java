package ChainResponsibility;

public abstract class Handler
{
    protected Handler _next;

    public void setNext(Handler next)
    {
        _next = next;
    }

    public void handle(String request)
    {
        if(_next != null)
        {
           _next.handle(request);
        }
    }
}
