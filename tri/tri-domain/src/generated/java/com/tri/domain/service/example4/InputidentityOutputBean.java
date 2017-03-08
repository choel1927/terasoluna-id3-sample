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
     * LicenseType <br>
     *  
     */
    private Integer licenseType;

    /** 
     * get LicenseType <br>
     * @return LicenseType  
     */
    public Integer getLicenseType() {
        return licenseType;
    }

    /** 
     * set LicenseType <br>
     * @param licenseType  LicenseType  
     */
    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }
}