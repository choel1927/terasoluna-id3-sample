/* 
 * @(#)TodoManagementServiceImpl.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.todomanagement;

import com.tri.domain.service.todomanagement.ListOutputBean;
import com.tri.domain.service.todomanagement.ListInputBean;
import com.tri.domain.service.todomanagement.AddOutputBean;
import com.tri.domain.service.todomanagement.AddInputBean;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TodoManagementServiceImpl implements TodoManagementService {
		
    public AddOutputBean add(AddInputBean input) {
        AddOutputBean output = new AddOutputBean();
        return output;
    }

    public ListOutputBean list(ListInputBean input) {
        ListOutputBean output = new ListOutputBean();
        
        return output;
    }
}