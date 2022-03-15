package com.szrcb.ibs.service;


import com.szrcb.ibs.facade.SampleService;

public class SampleServiceImpl implements SampleService {

    @Override
    public String message() {
        return "Hello, Service slitecore";
    }
}
