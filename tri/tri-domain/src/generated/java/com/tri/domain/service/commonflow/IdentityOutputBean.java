/* 
 * @(#)IdentityOutputBean.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.commonflow;

import java.io.Serializable;

/** 
 * Identity Page <br>
 *  
 */
public class IdentityOutputBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * License Type <br>
     *  
     */
    private String licenseType;

    /** 
     * get License Type <br>
     * @return License Type  
     */
    public String getLicenseType() {
        return licenseType;
    }

    /** 
     * set License Type <br>
     * @param licenseType  License Type  
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}