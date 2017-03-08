/* 
 * @(#)CommonFlowService.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.commonflow;

import com.tri.domain.service.commonflow.ReturncallerOutputBean;
import com.tri.domain.service.commonflow.ReturncallerInputBean;
import com.tri.domain.service.commonflow.IdentityOutputBean;
import com.tri.domain.service.commonflow.IdentityInputBean;

/**
 * The Service of CommonFlow.
 */
public interface CommonFlowService {

    /** 
     * Execute online processing
     * @param input Service input
     * @return Service output
     */
    IdentityOutputBean identity(IdentityInputBean input);

    /** 
     * Execute online processing
     * @param input Service input
     * @return Service output
     */
    ReturncallerOutputBean returncaller(ReturncallerInputBean input);
}