package AOP;

/**
 * @Author: Chen Zixin
 * @Date: 2020/10/27 3:01 下午
 */
public class RealSubject implements Subject {
    @Override
    public String sayHello(String s) {
        return "Hello " + s;
    }

    @Override
    public String sayGoodBye() {
        return "Seeya!";
    }
}
