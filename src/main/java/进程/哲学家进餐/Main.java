package 进程.哲学家进餐;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();
        Object e = new Object();
        Person p0 = new Person(a,b,0);
        Person p1 = new Person(b,c,1);
        Person p2 = new Person(c,d,2);
        Person p3 = new Person(d,e,3);
        Person p4 = new Person(e,a,4);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(p0);
        executorService.submit(p1);
        executorService.submit(p2);
        executorService.submit(p3);
        executorService.submit(p4);


    }
}
