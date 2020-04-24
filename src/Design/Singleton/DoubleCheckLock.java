package Design.Singleton;

public class DoubleCheckLock {

    private volatile static DoubleCheckLock INSTANCE;

    private DoubleCheckLock() {
    }

    public static DoubleCheckLock getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLock.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLock();
                }
            }
        }
        return INSTANCE;
    }
}
