package Design.Singleton;

public class HungrySingleton {

    private static HungrySingleton uniqueInstance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return uniqueInstance;
    }

}
