package Design.Singleton.EnumSingletonPack;

public class Test {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.doSomething();
    }
}
