package InterviewExperience;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//题目2:
//有三个线程ID分别是A、B、C,请用多线编程实现，在屏幕上循环打印10次ABC
public class AntTechSemaphore {

    public static void multiThread() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        });

        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    A.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("B");
            }
        });

        Thread C = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    B.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("C");
            }
        });

        ExecutorService poolExecutor = Executors.newSingleThreadExecutor();

        poolExecutor.submit(A);
        poolExecutor.submit(B);
        poolExecutor.submit(C);

        for (int i = 0; i < 10; i++) {
            A.start();
            B.start();
            C.start();
        }
    }

    public static void main(String[] args) {
        multiThread();
    }

}
