/* 
 * @(#)Example4Form.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example4;

import java.io.Serializable;

/** 
 * Example4Form <br>
 *  
 */
public class Example4Form implements Serializable {

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