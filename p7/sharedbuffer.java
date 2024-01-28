import java.util.LinkedList;

public class sharedbuffer 
{
    private final LinkedList<Integer> buffer=new LinkedList<Integer>();
    private  final int capacity;
    sharedbuffer(int cap)
    {
        capacity=cap;
    }
    public void produce(int item)throws InterruptedException
    {
        synchronized(this)
        {
            while(buffer.size()==capacity)
            {
                wait();
            }
            buffer.add(item);
            System.out.println("Producing item "+item);
            notifyAll();
        }
       
    }
    public int consume()throws InterruptedException
    {
        synchronized(this)
        {
            while(buffer.isEmpty())
            {
                wait();
            }
            int item =buffer.removeFirst();
            System.out.println("Consuming item"+item);
            notifyAll();
            return item;
        }
    }
    public static void main(String args[])
    {
        sharedbuffer sbuffer=new sharedbuffer(5);
        Thread pthrd=new Thread(new producer(sbuffer));
        Thread cthrd=new Thread(new consumer(sbuffer));
        pthrd.start();
        cthrd.start();
    }
    
}
