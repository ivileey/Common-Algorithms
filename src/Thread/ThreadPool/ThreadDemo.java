package Thread.ThreadPool;

import java.util.concurrent.*;

public class ThreadDemo {
    public static void main(String[] args) {
        ExecutorService e1 = Executors.newCachedThreadPool();
        ExecutorService e2 = Executors.newFixedThreadPool(10);
        ExecutorService e3 = Executors.newSingleThreadExecutor();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,20,10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10));
//        for(int i = 0; i < 10; i++) {
//            e2.execute(new MyTask(i));
//        }

        for(int i = 0; i < 10; i++) {
            e2.submit(() -> {
               System.out.println(Thread.currentThread().getName());
               Object object = null;
               System.out.println(object.toString());
            });
        }

    }
}
class MyTask implements Runnable {
    int i;
    public MyTask(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-------"+i);
        Object object = null;
        System.out.println(object.toString());
    }
}

