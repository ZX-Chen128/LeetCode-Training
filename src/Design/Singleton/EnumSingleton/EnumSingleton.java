package Design.Singleton.EnumSingleton;

public enum  EnumSingleton {

    INSTANCE;

    public void doSomething(){
        System.out.println("枚举类型单例模式启动");
    }
}
