package 进程.生产者消费者;

import java.util.List;

public class Consumer implements Runnable{
    private List<String> list;
    private String consumerName;

    public Consumer(String consumerName,List<String> list){
        this.list = list;
        this.consumerName=consumerName;
    }
    @Override
    public void run() {
        try {
            while (true){
                if(Thread.currentThread().isInterrupted()) break;
                synchronized (list){
                    if(list.size()==0){
                        list.notifyAll();
                        list.wait();
                    }else{
                        String msg = list.remove(0);
                        System.out.println(consumerName+"消费了一条消息："+msg);
                    }

                }
                Thread.sleep(1500);
            }
        }catch (Exception e){

        }
    }
}
