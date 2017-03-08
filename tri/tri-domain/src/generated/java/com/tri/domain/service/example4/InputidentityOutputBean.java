/* 
 * @(#)InputidentityOutputBean.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example4;

import java.io.Serializable;

/** 
 * Input Identity <br>
 *  
 */
public class InputidentityOutputBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * licenseType <br>
     *  
     */
    private Integer licenseType;

    /** 
     * get licenseType <br>
     * @return licenseType  
     */
    public Integer getLicenseType() {
        return licenseType;
    }

    /** 
     * set licenseType <br>
     * @param licenseType  licenseType  
     */
    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }
}