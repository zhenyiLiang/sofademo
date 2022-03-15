package com.szrcb.ibs.sofaconsumerdemo;

import com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:META-INF/ibs-sofaconsumerdemo/*.xml"})
public class SofaConsumerDemoMain {
    private static final Logger logger = LoggerFactory.getLogger(SofaConsumerDemoMain.class);

    public static void main(String[] args){

        SpringApplication springApplication = new SpringApplication(SofaConsumerDemoMain.class);
        ApplicationContext applicationContext = springApplication.run(args);
        ConsumerDemoService sampleService = applicationContext.getBean(ConsumerDemoService.class);

        logger.info("sofa consumer start");
    }
}
