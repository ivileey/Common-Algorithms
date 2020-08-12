package Thread.PrintOddAndEven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//交替打印奇偶数
//使用synchronized
public class PrintOddAndEven1 {
    public static int count = 0;

    static class PrintThread implements Runnable {
        static int value = 0;
        @Override
        public void run() {
            while(value <= 100) {
                synchronized (PrintThread.class) {
                    System.out.println(Thread.currentThread().getName() + ":" + value++);
                    PrintThread.class.notify();
                    try {
                        PrintThread.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //new Thread(new PrintThread(),"偶数").start();
        //new Thread(new PrintThread(),"奇数").start();
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(() -> {
            while(count <= 100) {
                synchronized (PrintOddAndEven1.class) {
                    try {
                        System.out.println("偶: " + count);
                        count++;
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        PrintOddAndEven1.class.notifyAll();
                        try {
                            PrintOddAndEven1.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        executorService.execute(() -> {
            while(count <= 100) {
               synchronized (PrintOddAndEven1.class) {
                  System.out.println("奇数 ：" + count);
                  count++;
                  PrintOddAndEven1.class.notifyAll();
                  try {
                      PrintOddAndEven1.class.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
               }
            }
        });
        executorService.shutdown();
    }
}
