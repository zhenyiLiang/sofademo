package com.szrcb.ibs.sofaconsumerdemo.service;


import com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoReq;
import com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoRes;
import com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoService;
import com.szrcb.ibs.sofaproviderdemo.facade.ProviderDemoReq;
import com.szrcb.ibs.sofaproviderdemo.facade.ProviderDemoRes;
import com.szrcb.ibs.sofaproviderdemo.facade.ProviderDemoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Random;

public class ConsumerDemoServiceImpl implements ConsumerDemoService {

    @Autowired
    private ProviderDemoService providerDemoService;

    @Override
    public ConsumerDemoRes message(ConsumerDemoReq req) {
        ProviderDemoReq providerReq = new ProviderDemoReq();
        providerReq.message = req.message+"-consumer";
        ProviderDemoRes providerRes = providerDemoService.message(providerReq);

        int rand = new Random().nextInt(10000);
        String consumerRes = "Hello, sofa consumer sampleService: "+req.message+"; "+rand;
        System.out.println(consumerRes);
        ConsumerDemoRes res  =new ConsumerDemoRes();
        res.result = consumerRes+ "\n" + providerRes.result;
        return res;
    }

}
