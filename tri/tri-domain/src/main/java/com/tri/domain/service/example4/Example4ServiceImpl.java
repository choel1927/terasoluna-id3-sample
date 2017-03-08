/* 
 * @(#)Example4ServiceImpl.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example4;

import com.tri.domain.service.example4.InputidentityOutputBean;
import com.tri.domain.service.example4.InputidentityInputBean;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Example4ServiceImpl implements Example4Service {

    public InputidentityOutputBean inputidentity(InputidentityInputBean input) {
        InputidentityOutputBean output = new InputidentityOutputBean();
        output.setLicenseType(input.getLicenseType());
        System.out.println("REDIRECT REQUEST IN EXAMPLE " + output.getLicenseType());
        return output;
    }
}