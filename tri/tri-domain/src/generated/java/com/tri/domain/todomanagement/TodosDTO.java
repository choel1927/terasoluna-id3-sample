/* 
 * @(#)TodosDTO.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.domain.todomanagement;

import java.io.Serializable;

/** 
 * TodosDTO <br>
 *  
 */
public class TodosDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * Todo Id <br>
     *  
     */
    private String todoId;

    /** 
     * get Todo Id <br>
     * @return Todo Id  
     */
    public String getTodoId() {
        return todoId;
    }

    /** 
     * set Todo Id <br>
     * @param todoId  Todo Id  
     */
    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

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