package test;

public class ThreadWait {

    private Object lock;

    public ThreadWait(Object lock) {
        this.lock = lock;
    }

    public void testWait() {
        try {
            synchronized (lock) {
                System.out.println("start wait........");
                System.out.println("end wait........");
                lock.wait();
                System.out.println("end wait........");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
