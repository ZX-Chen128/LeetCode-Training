package test;

import java.util.concurrent.atomic.AtomicReference;

public class test {

    AtomicReference<Thread> cas = new AtomicReference<Thread>();
    private int count = 0;

    public void lock(){

        Thread thread = Thread.currentThread();
        if(thread == cas.get()){
            count++;
            System.out.println("CurrenThread :"+thread+"第"+(count+1)+"次获取线程");
            return;
        }

        while(!cas.compareAndSet(null,thread)){
            System.out.println("CurrenThread :"+thread+"自旋中...");
        }

        System.out.println("CurrenThread :"+thread+"第"+(count+1)+"次获取线程");

    }

    public void unlock(){

        Thread cur = Thread.currentThread();

        if(cur == cas.get()){
            if(count>0){
                count--;
                System.out.println("CurrenThread :"+cur+"释放了1次资源，现在是第"+(count+1)+"次获取线程");
            } else {
                cas.compareAndSet(cur,null);
                System.out.println("CurrenThread :"+cur+"释放锁资源");
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

        test t1 = new test();

        new Thread(()->{
                t1.lock();
                t1.lock();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                t1.unlock();
                t1.unlock();

        },"臭臭").start();

        new Thread(()-> t1.lock(),"香香").start();

    }

}
