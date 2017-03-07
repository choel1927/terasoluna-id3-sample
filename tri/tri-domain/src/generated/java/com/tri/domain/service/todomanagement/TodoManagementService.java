/* 
 * @(#)TodoManagementService.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.todomanagement;

import com.tri.domain.service.todomanagement.ListOutputBean;
import com.tri.domain.service.todomanagement.ListInputBean;
import com.tri.domain.service.todomanagement.AddOutputBean;
import com.tri.domain.service.todomanagement.AddInputBean;

/**
 * The Service of todoManagement.
 */
public interface TodoManagementService {

    /** 
     * Execute online processing
     * @param input Service input
     * @return Service output
     */
    AddOutputBean add(AddInputBean input);

    /** 
     * Execute online processing
     * @param input Service input
     * @return Service output
     */
    ListOutputBean list(ListInputBean input);
}