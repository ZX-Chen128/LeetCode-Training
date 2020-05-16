package IO.Netty;

/**
 *
 *
 *在客户端程序中，group对应了我们IOClient.java中main函数起的线程，剩下的逻辑我在后面的文章中会详细分析，
 * 现在你要做的事情就是把这段代码拷贝到你的IDE里面，然后运行main函数，最后回到NettyServer.java的控制台，你会看到效果。
 *
 * 使用Netty之后是不是觉得整个世界都美好了，一方面Netty对NIO封装得如此完美，写出来的代码非常优雅，另外一方面，
 * 使用Netty之后，网络通信这块的性能问题几乎不用操心，尽情地让Netty榨干你的CPU吧。
 *
 * 目前我负责的两大长连接项目均峰值QPS在50W左右，单机连接数10W左右，集群规模在千万级别，底层均使用了Netty作为通信框架。
 * Netty如此高性能及稳定的特性让我几乎不用为性能而担忧，所以，如果你工作中需要接触到网络编程，Netty必将是你的最佳选择！

 *
 *
 *
 *

public class NettyClient {
    public static void main(String[] args) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        NioEventLoopGroup group = new NioEventLoopGroup();

        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel ch) {
                        ch.pipeline().addLast(new StringEncoder());
                    }
                });

        Channel channel = bootstrap.connect("127.0.0.1", 8000).channel();

        while (true) {
            channel.writeAndFlush(new Date() + ": hello world!");
            Thread.sleep(2000);
        }
    }
}

 */