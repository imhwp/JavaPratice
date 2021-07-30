package 进程.生产者消费者;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable{
    private String producerName;
    private List<String> list;
    private int maxSize;

    public Producer(List<String> list,int maxSize,String producerName){
        this.list=list;
        this.producerName=producerName;
        this.maxSize=maxSize;
    }


    @Override
    public void run() {
        try{
            while (true){
                if(Thread.currentThread().isInterrupted()) break;
                synchronized (list){
                    if(list.size()>=maxSize){
                        //消息区满
                        list.notifyAll();
                        list.wait();
                    }else{
                        Random r = new Random();
                        int i = r.nextInt();
                        list.add("生产者"+producerName+",消息"+i);
                        System.out.println("生产者"+producerName+",消息"+i);
                    }
                }
                Thread.sleep(1300);
            }
        }catch (Exception e){

        }

    }
}
