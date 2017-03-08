/* 
 * @(#)DecisionOutputBean.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example3;

import java.io.Serializable;

/** 
 * Decision <br>
 *  
 */
public class DecisionOutputBean implements Serializable {

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

    /** 
     * Decision Status <br>
     *  
     */
    private Boolean decisionStatus;

    /** 
     * get Decision Status <br>
     * @return Decision Status  
     */
    public Boolean getDecisionStatus() {
        return decisionStatus;
    }

    /** 
     * set Decision Status <br>
     * @param decisionStatus  Decision Status  
     */
    public void setDecisionStatus(Boolean decisionStatus) {
        this.decisionStatus = decisionStatus;
    }
}