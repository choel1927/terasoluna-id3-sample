/* 
 * @(#)TodoManagementForm.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.todomanagement;

import org.hibernate.validator.constraints.NotEmpty;
import java.io.Serializable;

/** 
 * todo-managementForm <br>
 *  
 */
public class TodoManagementForm implements Serializable {

    public interface Add {
    }

    private static final long serialVersionUID = 1L;

    /** 
     * Title <br>
     *  
     */
    @NotEmpty(groups = Add.class)
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
     * Page No <br>
     *  
     */
    private Integer pageNo;

    /** 
     * get Page No <br>
     * @return Page No  
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /** 
     * set Page No <br>
     * @param pageNo  Page No  
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    /** 
     * Page Size <br>
     *  
     */
    private Integer pageSize;

    /** 
     * get Page Size <br>
     * @return Page Size  
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /** 
     * set Page Size <br>
     * @param pageSize  Page Size  
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}