package IO.Netty;

/**
 *
 *
 *<dependency>
 *         <groupId>io.netty</groupId>
 *         <artifactId>netty-all</artifactId>
 *         <version>4.1.6.Final</version>
 *</dependency>
 *
 *
 *
 * 这么一小段代码就实现了我们前面NIO编程中的所有的功能，包括服务端启动，接受新连接，打印客户端传来的数据，怎么样，是不是比JDK原生的NIO编程优雅许多？
 *
 * 初学Netty的时候，由于大部分人对NIO编程缺乏经验，因此，将Netty里面的概念与IO模型结合起来可能更好理解
 *
 * 1.boos对应，IOServer.java中的接受新连接线程，主要负责创建新连接
 * 2.worker对应 IOClient.java中的负责读取数据的线程，主要用于读取数据以及业务逻辑处理
 *
 * 然后剩下的逻辑我在后面的系列文章中会详细分析，你可以先把这段代码拷贝到你的IDE里面，然后运行main函数
 *
 *


public class NettyServer {
    public static void main(String[] args) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();

        NioEventLoopGroup boos = new NioEventLoopGroup();
        NioEventLoopGroup worker = new NioEventLoopGroup();
        serverBootstrap
                .group(boos, worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    protected void initChannel(NioSocketChannel ch) {
                        ch.pipeline().addLast(new StringDecoder());
                        ch.pipeline().addLast(new SimpleChannelInboundHandler<String>() {
                            @Override
                            protected void channelRead0(ChannelHandlerContext ctx, String msg) {
                                System.out.println(msg);
                            }
                        });
                    }
                })
                .bind(8000);
    }
}


 */
