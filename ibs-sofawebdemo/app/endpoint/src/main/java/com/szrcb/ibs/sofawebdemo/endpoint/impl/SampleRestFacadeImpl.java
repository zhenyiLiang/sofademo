package com.szrcb.ibs.sofawebdemo.endpoint.impl;


import com.alipay.hessian.generic.model.GenericObject;
import com.alipay.sofa.rpc.api.GenericService;
import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.szrcb.ibs.sofawebdemo.endpoint.facade.SampleRestFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * REST service interface implementation.
 */
@Service
@SofaService(interfaceType = SampleRestFacade.class,bindings = @SofaServiceBinding(bindingType = "rest"))
public class SampleRestFacadeImpl implements SampleRestFacade {

    Logger logger =LoggerFactory.getLogger(SampleRestFacadeImpl.class);
    private int count = 0;
    public SampleRestFacadeImpl(){
        System.out.println("print start");
    }

    @Override
    public Map<String, Object> hello(String message) {
        Map<String,Object> dataMap = new HashMap<>(2);
        dataMap.put("message", message);
        return hello(dataMap);
    }

    @Override
    public Map<String, Object> hello(Map<String, Object> dataMap) {
        logger.info("request: {}, count:{}", dataMap, count++);
        ConsumerConfig<GenericService> consumerConfig = new ConsumerConfig<GenericService>()
                .setInterfaceId("com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoService")
                .setGeneric(true)
                .setDirectUrl("127.0.0.1:12200");
        GenericService genericService = consumerConfig.refer();

        String message = (String) dataMap.get("message");
        GenericObject genericObject = new GenericObject("com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoReq");
        genericObject.putField("message", message+"-rest");
        GenericObject resObj=new GenericObject("com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoRes");
        try {
            resObj = (GenericObject) genericService.$genericInvoke("message", new String[]{"com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoReq"}, new Object[]{genericObject});
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            consumerConfig.unRefer();
        }
        Map<String, Object> resMap = resObj.getFields();
        resMap.put("restResult", "Hello, SOFARest! " + message);
        return resMap;
    }
}
