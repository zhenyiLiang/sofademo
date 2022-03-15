package com.szrcb.ibs.sofawebdemo;

import com.szrcb.ibs.sofawebdemo.endpoint.facade.SampleRestFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.TimeUnit;

@SpringBootApplication(scanBasePackages = {"com.szrcb.ibs.sofawebdemo"})
@ImportResource({"classpath*:META-INF/ibs-sofawebdemo/*.xml"})
public class SofaWebDemoMain {

    private static final Logger logger = LoggerFactory.getLogger(SofaWebDemoMain.class);

    public static void main(String[] args){

        SpringApplication springApplication = new SpringApplication(SofaWebDemoMain.class);
        ApplicationContext applicationContext = springApplication.run(args);

        if (logger.isInfoEnabled()){
            logger.info("application start");
        }

    }

    private static void printMsg(String msg) {
        System.out.println(msg);
        if (logger.isInfoEnabled()) {
            logger.info(msg);
        }
    }
}
