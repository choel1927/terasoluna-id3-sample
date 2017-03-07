/* 
 * @(#)Example1Controller.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example1;

import com.tri.app.TriAppHelper;
import com.tri.domain.service.example1.Example1Service;

import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Generated;

import org.springframework.ui.Model;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

/**
 * The Controller class of Example1.
 */
@SuppressWarnings("unused")
@Controller
@RequestMapping("Example1")
public class Example1Controller {

    @ModelAttribute
    public Example1Form setUpForm() {
        Example1Form form = new Example1Form();
        return form;
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "input", method = { RequestMethod.GET })
    public String input(Example1Form form, Model model) {
        return "Example1/S001";
    }

    @Inject
    TriAppHelper triAppHelper;

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "output", method = { RequestMethod.POST })
    public String output(Example1Form form, Model model) {
        return "Example1/S002";
    }
}