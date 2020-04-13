package Design;

/**
 *     private volatile static Singleton uniqueInstance;
 *
 *     private Singleton(){}
 *
 *     public static Singleton getUniqueInstance(){
 *         if(uniqueInstance == null){
 *             synchronized (Singleton.class){
 *                 if(uniqueInstance == null){
 *                     uniqueInstance = new Singleton();
 *                 }
 *             }
 *         }
 *         return uniqueInstance;
 *     }
 */

// 双重检验锁方式实现单例模式
public class Singleton {

    private volatile static Singleton usingleton;

    private Singleton(){}

    public Singleton getUsingleton(){
        if(usingleton==null){
            synchronized (Singleton.class){
                if(usingleton==null){
                    usingleton=new Singleton();
                }
            }
        }
        return usingleton;
    }

}
