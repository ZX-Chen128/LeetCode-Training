package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/29 4:16 下午
 */
public class PrintinOrder {

    public Object object = new Object();

    public int state = 0;

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (object) {
            while(state != 0) object.wait();
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            state = 1;
            object.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (object) {
            while (state != 1) object.wait();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            state = 2;
            object.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (object) {
            while (state != 2) object.wait();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            state = 3;
            object.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PrintinOrder po = new PrintinOrder();
        Thread A = new Thread(()->{
            System.out.println("first");
        });
        Thread B = new Thread(()->{
            System.out.println("second");
        });
        Thread C = new Thread(()->{
            System.out.println("third");
        });

        new Thread(()->{
            try {
                po.third(C);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                po.first(A);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                po.second(B);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
