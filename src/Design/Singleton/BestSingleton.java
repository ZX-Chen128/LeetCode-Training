package Design.Singleton;

//能够同时具备线程安全、延迟加载以及节省大量同步判断资源的优势

public class BestSingleton {

    private static class Instance{
        private static BestSingleton instance = new BestSingleton();

    }

    private BestSingleton(){}

    public static BestSingleton getInstance(){
        return Instance.instance;
    }

}
