package thread;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable {
    private CountDownLatch countDownLatch;
    public MyRunnable(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程启动");
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"线程关闭");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            countDownLatch.countDown();
            System.out.println(countDownLatch.getCount());
        }



    }
}
