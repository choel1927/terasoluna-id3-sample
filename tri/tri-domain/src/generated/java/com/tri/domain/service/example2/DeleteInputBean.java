/* 
 * @(#)DeleteInputBean.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example2;

import java.io.Serializable;

/** 
 * Delete Item <br>
 *  
 */
public class DeleteInputBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * Item Id <br>
     *  
     */
    private Integer itemId;

    /** 
     * get Item Id <br>
     * @return Item Id  
     */
    public Integer getItemId() {
        return itemId;
    }

    /** 
     * set Item Id <br>
     * @param itemId  Item Id  
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}