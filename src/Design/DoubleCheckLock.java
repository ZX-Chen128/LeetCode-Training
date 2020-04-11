package Design;

import java.util.concurrent.ConcurrentHashMap;

public class DoubleCheckLock {
    private static volatile DoubleCheckLock INSTANCE;

    public DoubleCheckLock(){}

    ConcurrentHashMap chm = null;

    public static DoubleCheckLock getINSTANCE(){
        if(INSTANCE == null){
            synchronized (DoubleCheckLock.class){
                if(INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new DoubleCheckLock();
                }
            }
        }
        return INSTANCE;
    }
}
