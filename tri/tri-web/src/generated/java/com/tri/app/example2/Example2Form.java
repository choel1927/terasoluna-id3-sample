/* 
 * @(#)Example2Form.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example2;

import java.io.Serializable;

/** 
 * Example2Form <br>
 *  
 */
public class Example2Form implements Serializable {

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