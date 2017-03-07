/* 
 * @(#)Example2ServiceImpl.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.service.example2;

import com.tri.domain.example2.ItemListDTO;
import com.tri.domain.service.example2.DeleteOutputBean;
import com.tri.domain.service.example2.DeleteInputBean;
import com.tri.domain.service.example2.ListOutputBean;
import com.tri.domain.service.example2.ListInputBean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.tri.domain.service.example2.AddOutputBean;
import com.tri.domain.service.example2.AddInputBean;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Example2ServiceImpl implements Example2Service {

    private Integer counterId = 0;

    private List<ItemListDTO> itemList = new ArrayList<>();

    public AddOutputBean add(AddInputBean input) {
    	ItemListDTO item = new ItemListDTO();
    	item.setItemId(counterId);
    	item.setItemName(input.getItemName());
    	itemList.add(item);
    	counterId++;
    	
        AddOutputBean output = new AddOutputBean();
        output.setItemList(itemList);
        
        return output;
    }

    public ListOutputBean list(ListInputBean input) {
        ListOutputBean output = new ListOutputBean();
        output.setItemList(itemList);
        
        return output;
    }

    public DeleteOutputBean delete(DeleteInputBean input) {
    	Iterator<ItemListDTO> iterator = itemList.iterator();
    	while (iterator.hasNext()) {
    		if (iterator.next().getItemId().equals(input.getItemId())) {
    			iterator.remove();
    			break;
    		}
    	}
    	
    	DeleteOutputBean output = new DeleteOutputBean();
        output.setItemList(itemList);
        
        return output;
    }
}