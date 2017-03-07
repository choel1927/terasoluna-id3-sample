/* 
 * @(#)AddInputBean.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.todomanagement;

import java.io.Serializable;

/** 
 * Add Todo Item <br>
 *  
 */
public class AddInputBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * Title <br>
     *  
     */
    private String title;

    /** 
     * get Title <br>
     * @return Title  
     */
    public String getTitle() {
        return title;
    }

    /** 
     * set Title <br>
     * @param title  Title  
     */
    public void setTitle(String title) {
        this.title = title;
    }
}