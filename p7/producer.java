

public class producer implements Runnable  
{
    private final sharedbuffer buffer;
    producer(sharedbuffer buf)
    {
        buffer=buf;
    }
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                buffer.produce(i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
    
}
