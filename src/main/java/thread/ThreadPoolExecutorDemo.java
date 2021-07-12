package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 1000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10));
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i=0;i<10;i++){
            threadPoolExecutor.execute(new MyRunnable(countDownLatch));
        }
        countDownLatch.await();
        threadPoolExecutor.shutdown();
        System.out.println("线程池运行结束");
    }

}
