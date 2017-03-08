/* 
 * @(#)Example4Service.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example4;

import com.tri.domain.service.example4.InputidentityOutputBean;
import com.tri.domain.service.example4.InputidentityInputBean;

/**
 * The Service of Example4.
 */
public interface Example4Service {

    /** 
     * Execute online processing
     * @param input Service input
     * @return Service output
     */
    InputidentityOutputBean inputidentity(InputidentityInputBean input);
}