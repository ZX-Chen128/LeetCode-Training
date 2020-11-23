package AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @Author: Chen Zixin
 * @Date: 2020/11/9 5:58 下午
 */
public class ProxyDemo {
    public static void main(String[] args) {
        // 静态代理
        System.out.println("静态代理");
        Speaker speakerStatic = new Laywer();
        speakerStatic.speak();
        System.out.println("---------------------");
        // JDK动态代理:本体必须实现接口
        System.out.println("JDK动态代理");
        LaywerProxy laywerProxy = new LaywerProxy(new Zhangsan());
        Speaker speakerDynamic = (Speaker) Proxy.newProxyInstance(ProxyDemo.class.getClassLoader(), new Class[]{Speaker.class}, laywerProxy);
        speakerDynamic.speak();
        // CGLib动态代理:不需要本体实现接口

    }
}


// 被代理接口
interface Speaker {
    public void speak();
}


// 被代理类
class Zhangsan implements Speaker {

    @Override
    public void speak() {
        System.out.println("冤啊！");
    }
}


// 静态代理
class Laywer implements Speaker {

    Zhangsan zhangsan = new Zhangsan();

    @Override
    public void speak() {
        System.out.println("了解张三情况");
        zhangsan.speak();
        System.out.println("张三无罪！");
    }
}

// JDK动态代理
class LaywerProxy implements InvocationHandler {

    private Object obj;

    LaywerProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("speak")) {
            System.out.println("了解张三情况");
            method.invoke(obj, args); // 反射
            System.out.println("张三无罪！");
        }
        return null;
    }
}