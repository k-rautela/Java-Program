import java.util.concurrent.*;

class Producer extends Thread{
    private BlockingQueue<Integer> buffer;
    
    public Producer(BlockingQueue<Integer> buffer){
        this.buffer=buffer;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try{
                buffer.put(i);
                System.out.println("Produced : "+i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread{
    private BlockingQueue<Integer> buffer;
    
    public Consumer(BlockingQueue<Integer> buffer){
        this.buffer=buffer;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try{
                int item=buffer.take();
                System.out.println("Consumer : "+item);
                Thread.sleep(1500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class program7 {
    public static void main(String[] args){
    BlockingQueue<Integer> buffer=new ArrayBlockingQueue<>(5);

    Producer producer=new Producer(buffer);
    Consumer consumer=new Consumer(buffer);

    producer.start();
    consumer.start();
}
}