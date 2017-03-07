/* 
 * @(#)AddInputBean.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example2;

import java.io.Serializable;

/** 
 * Add Item <br>
 *  
 */
public class AddInputBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * Item Name <br>
     *  
     */
    private String itemName;

    /** 
     * get Item Name <br>
     * @return Item Name  
     */
    public String getItemName() {
        return itemName;
    }

    /** 
     * set Item Name <br>
     * @param itemName  Item Name  
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}