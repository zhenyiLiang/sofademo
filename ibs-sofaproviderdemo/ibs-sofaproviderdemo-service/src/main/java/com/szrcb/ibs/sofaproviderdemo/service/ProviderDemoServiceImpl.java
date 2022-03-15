package com.szrcb.ibs.sofaproviderdemo.service;


import com.szrcb.ibs.sofaproviderdemo.facade.ProviderDemoService;
import com.szrcb.ibs.sofaproviderdemo.facade.ProviderDemoReq;
import com.szrcb.ibs.sofaproviderdemo.facade.ProviderDemoRes;

import java.util.Random;

public class ProviderDemoServiceImpl implements ProviderDemoService {

    @Override
    public ProviderDemoRes message(ProviderDemoReq req) {
        int rand = new Random().nextInt(10000);
        String providerRes = "Hello, sofa provider sampleService: "+req.message+"; "+rand;
        System.out.println(providerRes);
        ProviderDemoRes res = new ProviderDemoRes();
        res.result = providerRes;
        return res;
    }
}
