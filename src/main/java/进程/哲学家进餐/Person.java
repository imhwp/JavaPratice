package 进程.哲学家进餐;

import java.util.concurrent.ThreadPoolExecutor;

public class Person implements Runnable {
    private Object left;
    private Object right;
    private int id;
    public Person(Object left,Object right,int id){
        this.left=left;
        this.right=right;
        this.id=id;
    }
    @Override
    public void run() {
        try{
            while (true){
                if(Thread.currentThread().isInterrupted()) break;
                if(id%2==0){
                    synchronized (left){
                        System.out.println("哲学家"+id+"获得了左边筷子");
                        synchronized (right){
                            System.out.println("哲学家"+id+"获得了右边边筷子并吃饭");
                            Thread.currentThread().sleep(2000);
                        }
                        System.out.println("哲学家"+id+"吃饭结束，并放下右边筷子");
                    }
                    System.out.println("哲学家"+id+"吃饭结束，并放下左边筷子");
                }else{
                    synchronized (right){
                        System.out.println("哲学家"+id+"获得了右边筷子");
                        synchronized (left){
                            System.out.println("哲学家"+id+"获得了左边筷子并吃饭");
                            Thread.currentThread().sleep(2000);
                        }
                        System.out.println("哲学家"+id+"吃饭结束，并放下左边筷子");
                    }
                    System.out.println("哲学家"+id+"吃饭结束，并放下右边筷子");
                }

            }
        }catch (Exception e){

        }

    }
}
