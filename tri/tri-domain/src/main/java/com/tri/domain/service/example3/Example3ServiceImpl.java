/* 
 * @(#)Example3ServiceImpl.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example3;

import com.tri.domain.service.example3.DecisionOutputBean;
import com.tri.domain.service.example3.DecisionInputBean;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Example3ServiceImpl implements Example3Service {
	private static final int PAGE_ONE = 1;
	private static final int PAGE_TWO = 2;
	
    public DecisionOutputBean decision(DecisionInputBean input) {
        DecisionOutputBean output = new DecisionOutputBean();
        int page = Integer.parseInt(input.getPageDropdown());
        switch (page) {
        	case PAGE_ONE:
        		output.setPageDropdown("THIS IS PAGE ONE");
        		break;
        	case PAGE_TWO:
        		output.setPageDropdown("THIS IS PAGE TWO");
        		break;
        }
        
        return output;
    }
}