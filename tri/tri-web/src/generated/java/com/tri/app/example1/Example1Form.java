/* 
 * @(#)Example1Form.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example1;

import java.io.Serializable;

/** 
 * exampleOneForm <br>
 *  
 */
public class Example1Form implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 
     * Input Text <br>
     *  
     */
    private String inputText;

    /** 
     * get Input Text <br>
     * @return Input Text  
     */
    public String getInputText() {
        return inputText;
    }

    /** 
     * set Input Text <br>
     * @param inputText  Input Text  
     */
    public void setInputText(String inputText) {
        this.inputText = inputText;
    }
}