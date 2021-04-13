package InterviewExperience;

import java.util.concurrent.Semaphore;

//题目2:
//有三个线程ID分别是A、B、C,请用多线编程实现，在屏幕上循环打印10次ABC
public class AntTechSemaphore {
    static Semaphore s1 = new Semaphore(1);
    static Semaphore s2 = new Semaphore(0);
    static Semaphore s3 = new Semaphore(0);

    public static void main(String[] args) {
        printABC();
    }

    public static void printABC() {
        new Thread(() -> {
            try {
                print("A", s1, s2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                print("B", s2, s3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                print("C", s3, s1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void print(String name, Semaphore nowSemaphore, Semaphore nextSemaphore) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            nowSemaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "  " +name + "  第" + i + "次");
            nextSemaphore.release();
        }
    }
}
