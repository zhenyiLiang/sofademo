package com.szrcb.ibs.sofaconsumerdemo.test.usercases;

import com.szrcb.ibs.sofaconsumerdemo.facade.ConsumerDemoService;
import com.szrcb.ibs.sofaconsumerdemo.test.base.AbstractTestBase;
import org.springframework.beans.factory.annotation.Autowired;

public class BeanTest extends AbstractTestBase {

    @Autowired
    private ConsumerDemoService consumerDemoService;


    @Override
    protected void childSetUp() {

    }
}
