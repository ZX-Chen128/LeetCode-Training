package Design;

import java.util.concurrent.*;

/**
 * 五种调用线程的方法
 */
public class FiveThread {

    static class MyThread extends Thread {
        public void run(){
            System.out.println("Hello World! MyThread!");
        }
    }

    static class MyRun implements Runnable{
        @Override
        public void run() {
            System.out.println("Hello World! MyRun!");
        }
    }

    static class MyCall implements Callable<String>{
        @Override
        public String call() throws Exception {
            System.out.println("Hello World! MyCall!");
            return "success";
        }
    }

    public static void main(String[] args) {

        new MyThread().start();
        new Thread(new MyRun()).start();
        new Thread(()->{
            System.out.println("Hello World! Lambda!");
        }).start();

        Thread t = new Thread(new FutureTask<String>(new MyCall()));
        t.start();

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(()->{
            System.out.println("Hello World! ThreadPool!");
        });
        service.shutdown();

    }

}
