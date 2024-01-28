public class consumer implements Runnable {
    private final sharedbuffer buffer;
    consumer(sharedbuffer buf)
    {
        buffer=buf;
    }
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                int item=buffer.consume();
                Thread.sleep(1500);
            }
            catch(InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
    
}
