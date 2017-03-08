/* 
 * @(#)Example3Service.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example3;

import com.tri.domain.service.example3.DecisionOutputBean;
import com.tri.domain.service.example3.DecisionInputBean;

/**
 * The Service of Example3.
 */
public interface Example3Service {

    /** 
     * Execute online processing
     * @param input Service input
     * @return Service output
     */
    DecisionOutputBean decision(DecisionInputBean input);
}