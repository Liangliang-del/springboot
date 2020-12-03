package com.chl.runner;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * TODO 为了实现服务器启动即执行某些操作，只需要实现spring boot中的CommandLineRunner接口即可
 * @author me
 *
 */
@Component
@Order(value = 2) // 设置启动执行顺序
public class MyCommandRunnerTwo implements CommandLineRunner {

    private Logger logger = Logger.getLogger(this.getClass());

    /**
     * TODO 系统启动即会执行Run方法
     */
    @Override
    public void run(String... strings) throws Exception {
        logger.info("执行启动任务2...");
    }
}
