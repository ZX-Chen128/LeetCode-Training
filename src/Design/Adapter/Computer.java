package Design.Adapter;

//电脑需要转换器连接网线完成上网
public class Computer {

    public void net(NetToUsb adapter){
        adapter.HandleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter2 adapter = new Adapter2(adaptee);

        computer.net(adapter);
    }

}
