package Design.Singleton;

public class Singleton {

    private static class Instance{
        private static Singleton instance = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance(){
        return Instance.instance;
    }

}
