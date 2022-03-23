package com.lpc.server;

import com.lpc.service.impl.AuthorityServiceImpl;
import com.lpc.service.impl.DictServiceImpl;
import com.lpc.service.impl.UserServiceImpl;
import com.lpc.util.Config;
import com.lpc.util.SpringUtil;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author 濃霧-遠方
 * @date 2021/11/10
 */
public class MyServer {
    private Server server;
    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    private void start(int port) throws IOException {
        ApplicationContext context = SpringUtil.getApplicationContext();
        server = ServerBuilder.forPort(port)
                .addService((UserServiceImpl)context.getBean("userService"))
                .addService((AuthorityServiceImpl)context.getBean("authorityService"))
                .addService((DictServiceImpl)context.getBean("dictService"))
                .build().start();
    }

    private void stop() throws InterruptedException{
        if (server != null){
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final MyServer server = (MyServer) SpringUtil.getApplicationContext().getBean("myServer");
        server.start(Config.SERVER_PORT);
        server.blockUntilShutdown();

    }
}
