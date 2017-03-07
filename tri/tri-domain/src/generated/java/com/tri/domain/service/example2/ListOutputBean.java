/* 
 * @(#)ListOutputBean.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example2;

import com.tri.domain.example2.ItemListDTO;
import java.util.List;
import java.io.Serializable;

/** 
 * List Item <br>
 *  
 */
public class ListOutputBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * Item List <br>
     *  
     */
    private List<ItemListDTO> itemList;

    /** 
     * get Item List <br>
     * @return Item List  
     */
    public List<ItemListDTO> getItemList() {
        return itemList;
    }

    /** 
     * set Item List <br>
     * @param itemList  Item List  
     */
    public void setItemList(List<ItemListDTO> itemList) {
        this.itemList = itemList;
    }
}