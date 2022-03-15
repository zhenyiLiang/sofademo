package com.szrcb.ibs.sofaproviderdemo.test.usercases;

import com.szrcb.ibs.sofaproviderdemo.facade.ProviderDemoService;
import com.szrcb.ibs.sofaproviderdemo.test.base.AbstractTestBase;
import org.springframework.beans.factory.annotation.Autowired;

public class BeanTest extends AbstractTestBase {

    @Autowired
    private ProviderDemoService providerDemoService;


    @Override
    protected void childSetUp() {

    }
}
