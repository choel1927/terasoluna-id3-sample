/* 
 * @(#)CommonFlowServiceImpl.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.commonflow;

import com.tri.domain.service.commonflow.ReturncallerOutputBean;
import com.tri.domain.service.commonflow.ReturncallerInputBean;
import com.tri.domain.service.commonflow.IdentityOutputBean;
import com.tri.domain.service.commonflow.IdentityInputBean;

import javax.annotation.Generated;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommonFlowServiceImpl implements CommonFlowService {

    public IdentityOutputBean identity(IdentityInputBean input) {
        IdentityOutputBean output = new IdentityOutputBean();
        output.setLicenseType(200);
        System.out.println("INSIDE COMMON SCREEN " + input.getLicenseType());
        return output;
    }

    @Generated("TERASOLUNA IDE")
    public ReturncallerOutputBean returncaller(ReturncallerInputBean input) {
        ReturncallerOutputBean output = new ReturncallerOutputBean();
        output.setName("sample value for name");
        output.setPhone("sample value for phone");
        output.setEmail("sample value for email");
        output.setAddress("sample value for address");
        output.setLicenseType(9999);
        return output;
    }
}