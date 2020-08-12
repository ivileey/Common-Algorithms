package Thread.PrintOddAndEven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

//交替打印奇偶数
//仅使用volatile关键字
//使用线程池和new Thread两种方法
public class PrintOddAndEven2 {
    private static AtomicInteger count = new AtomicInteger(0);

    private volatile static boolean flag = true;

    static class PrintThread1 implements Runnable{

        @Override
        public void run() {
            while(count.get() <= 100) {
                if(flag) {
                    System.out.println("偶数" + count.getAndIncrement());
                    flag = false;
                }
            }
        }
    }

    static class PrintThread2 implements Runnable{

        @Override
        public void run() {
            while(count.get() <= 100) {
                if(!flag) {
                    System.out.println("奇数" + count.getAndIncrement());
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        executorService.execute(() -> {
//            while(count.get() <= 100) {
//                if(flag) {
//                    System.out.println("偶数" + count.getAndIncrement());
//                    flag = false;
//                }
//            }
//        });
//
//        executorService.execute(() -> {
//            while(count.get() <= 100) {
//                if(!flag) {
//                    System.out.println("奇数" + count.getAndIncrement());
//                    flag = true;
//                }
//            }
//        });
//
//        executorService.shutdown();
        new Thread(new PrintThread1()).start();
        new Thread(new PrintThread2()).start();
    }
}
