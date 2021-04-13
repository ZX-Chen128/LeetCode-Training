package InterviewExperience;

import java.util.concurrent.Semaphore;

//题目2:
//有三个线程ID分别是A、B、C,请用多线编程实现，在屏幕上循环打印10次ABC
public class AntTechSemaphore {
    public static void main(String[] args) {
        PrintABCUsingSemaphore printABC = new PrintABCUsingSemaphore();
        new Thread(() -> printABC.printA()).start();
        new Thread(() -> printABC.printB()).start();
        new Thread(() -> printABC.printC()).start();
    }
}

class PrintABCUsingSemaphore {
    private Semaphore semaphoreA = new Semaphore(1);
    private Semaphore semaphoreB = new Semaphore(0);
    private Semaphore semaphoreC = new Semaphore(0);
    //private int attempts = 0;


    public void printA() {
        print("A", semaphoreA, semaphoreB);
    }

    public void printB() {
        print("B", semaphoreB, semaphoreC);
    }

    public void printC() {
        print("C", semaphoreC, semaphoreA);
    }

    private void print(String name, Semaphore currentSemaphore, Semaphore nextSemaphore) {
        for (int i = 0; i < 10; ) {
            try {
                currentSemaphore.acquire();
                //System.out.println(Thread.currentThread().getName()+" try to print "+name+", attempts : "+(++attempts));
                System.out.println(Thread.currentThread().getName() +" print "+ name);
                i++;
                nextSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}