package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class Method {
    static AtomicInteger a = new AtomicInteger(1);
    public static void main(String[] args) throws InterruptedException{

        for(int i = 0; i < 99; i++) {
            new Thread(() -> {
                a.getAndIncrement();
            }).start();

            new Thread(() -> {
                a.getAndIncrement();
            }).start();

        }
        System.out.println(a);
    }
}
