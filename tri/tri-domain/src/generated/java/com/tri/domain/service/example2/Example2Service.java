/* 
 * @(#)Example2Service.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example2;

import com.tri.domain.service.example2.DeleteOutputBean;
import com.tri.domain.service.example2.DeleteInputBean;
import com.tri.domain.service.example2.ListOutputBean;
import com.tri.domain.service.example2.ListInputBean;
import com.tri.domain.service.example2.AddOutputBean;
import com.tri.domain.service.example2.AddInputBean;

/**
 * The Service of Example2.
 */
public interface Example2Service {

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

    /** 
     * Execute online processing
     * @param input Service input
     * @return Service output
     */
    DeleteOutputBean delete(DeleteInputBean input);
}