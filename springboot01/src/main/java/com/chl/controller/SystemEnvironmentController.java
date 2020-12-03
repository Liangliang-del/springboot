package com.chl.controller;

import org.apache.log4j.Logger;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemEnvironmentController implements EnvironmentAware {

    private String java_home;

    private Logger logger = Logger.getLogger(getClass());

    @RequestMapping("/javaHome")
    public String getJavaHome(){
        return java_home;
    }

    @Override
    public void setEnvironment(Environment environment) {
        java_home = environment.getProperty("JAVA_HOME");
        logger.info("控制器中获取的系统环境变量：" + java_home);
    }
}
