/* 
 * @(#)Example3Form.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example3;

import java.io.Serializable;

/** 
 * Example3Form <br>
 *  
 */
public class Example3Form implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * Select Page <br>
     *  
     */
    private String pageDropdown;

    /** 
     * get Select Page <br>
     * @return Select Page  
     */
    public String getPageDropdown() {
        return pageDropdown;
    }

    /** 
     * set Select Page <br>
     * @param pageDropdown  Select Page  
     */
    public void setPageDropdown(String pageDropdown) {
        this.pageDropdown = pageDropdown;
    }
}