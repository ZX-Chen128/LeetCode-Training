package Design.Adapter;


//转换器的实现
//使用继承实现的，类适配器，单继承
public class Adapter extends Adaptee implements NetToUsb{

    @Override
    public void HandleRequest() {
        super.request();
    }

}
