package com.szrcb.ibs.sofaproviderdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:META-INF/ibs-sofaproviderdemo/*.xml"})
public class SofaProviderDemoMain {
    private static final Logger logger = LoggerFactory.getLogger(SofaProviderDemoMain.class);

    public static void main(String[] args){

        SpringApplication springApplication = new SpringApplication(SofaProviderDemoMain.class);
        ApplicationContext applicationContext = springApplication.run(args);

        logger.info("sofa provider start");
    }
}
