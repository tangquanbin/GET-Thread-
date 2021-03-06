package com.netty.decodeandencode.client;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoop;

import java.util.concurrent.TimeUnit;

/**
 * @author monkjavaer
 * @date 2019/7/15 16:47
 */
public class ConnectionListener implements ChannelFutureListener {
    @Override
    public void operationComplete(ChannelFuture future) throws Exception {
        if (!future.isSuccess()) {
            //获取错误信息
            Throwable cause = future.cause();
            cause.printStackTrace();

            final EventLoop loop = future.channel().eventLoop();
            loop.schedule(new Runnable() {
                @Override
                public void run() {
                    System.err.println("服务端链接不上，开始重连操作...");
                    try {
                        TestClient.connect();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 5, TimeUnit.SECONDS);
        } else {
            System.err.println("服务端链接成功，do something...");
        }
    }
}
