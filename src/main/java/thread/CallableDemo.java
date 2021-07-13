package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable {
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(()->1);
    @Override
    public Object call() throws Exception {
        int i = threadLocal.get();
        for(int j=0;j<100;j++){
            i+=1;
        }
        return i;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallableDemo callableDemo = new CallableDemo();
        FutureTask futureTask = new FutureTask(callableDemo);
        FutureTask futureTask2 = new FutureTask(callableDemo);
        FutureTask futureTask3 = new FutureTask(callableDemo);
        futureTask.run();
        System.out.println("返回值"+futureTask.get());
        futureTask2.run();
        System.out.println("返回值"+futureTask2.get());
        futureTask3.run();
        System.out.println("返回值"+futureTask3.get());
    }
}
