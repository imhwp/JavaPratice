package 进程.生产者消费者;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        List<String> msgBox = new ArrayList<>();
        Producer p1 = new Producer(msgBox,10,"p1");
        Producer p2 = new Producer(msgBox,10,"p2");
        Producer p3 = new Producer(msgBox,10,"p3");
        Consumer c1 = new Consumer("c1",msgBox);
        Consumer c2 = new Consumer("c2",msgBox);
        Consumer c3 = new Consumer("c3",msgBox);
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(10,10,10, TimeUnit.SECONDS,new LinkedBlockingDeque<>(5));
        tpe.execute(p1);
        tpe.execute(p2);
        tpe.execute(p3);
        tpe.execute(c1);
        tpe.execute(c2);
        tpe.execute(c3);

    }
}
