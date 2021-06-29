package AlibabaJava;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chenzixin
 */
public class UserThreadFactory implements ThreadFactory {

    private final String namePrefix;
    private final AtomicInteger nextId = new AtomicInteger(1);

    /**
     * 定义线程组名称，在 jstack 问题排查时，非常有帮助
     *
     * @param whatFeatureOfGroup
     */
    UserThreadFactory(String whatFeatureOfGroup) {
        namePrefix = "From UserThreadFactory's " + whatFeatureOfGroup + "-Worker-";
    }

    @Override
    public Thread newThread(Runnable task) {
        String name = namePrefix + nextId.getAndIncrement();
        Thread thread = new Thread(task, name);
        System.out.println(thread.getName());
        return thread;
    }

    public static void main(String[] args) {
        UserThreadFactory thread = new UserThreadFactory("上海外高桥");
        thread.newThread(() -> System.out.println("执行完毕"));
    }
}
