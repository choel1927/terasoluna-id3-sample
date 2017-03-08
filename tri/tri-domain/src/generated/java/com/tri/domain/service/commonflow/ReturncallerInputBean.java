/* 
 * @(#)ReturncallerInputBean.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.commonflow;

import java.io.Serializable;

/** 
 * Return To Caller <br>
 *  
 */
public class ReturncallerInputBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * Name <br>
     *  
     */
    private String name;

    /** 
     * get Name <br>
     * @return Name  
     */
    public String getName() {
        return name;
    }

    /** 
     * set Name <br>
     * @param name  Name  
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Phone <br>
     *  
     */
    private String phone;

    /** 
     * get Phone <br>
     * @return Phone  
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * set Phone <br>
     * @param phone  Phone  
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Email <br>
     *  
     */
    private String email;

    /** 
     * get Email <br>
     * @return Email  
     */
    public String getEmail() {
        return email;
    }

    /** 
     * set Email <br>
     * @param email  Email  
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Address <br>
     *  
     */
    private String address;

    /** 
     * get Address <br>
     * @return Address  
     */
    public String getAddress() {
        return address;
    }

    /** 
     * set Address <br>
     * @param address  Address  
     */
    public void setAddress(String address) {
        this.address = address;
    }

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