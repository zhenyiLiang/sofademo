package com.szrcb.ibs.sofawebdemo;

import com.szrcb.ibs.sofawebdemo.endpoint.facade.SampleRestFacade;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import org.springframework.stereotype.Component;

@Component
public class ReferenceHolder {

    @SofaReference(interfaceType = SampleRestFacade.class, binding = @SofaReferenceBinding(bindingType = "rest",directUrl = "127.0.0.1:8341"))
    private SampleRestFacade sampleRestFacade;

    public SampleRestFacade getSampleRestFacade() {
        return sampleRestFacade;
    }

    public void setSampleRestFacade(SampleRestFacade sampleRestFacade) {
        this.sampleRestFacade = sampleRestFacade;
    }

}