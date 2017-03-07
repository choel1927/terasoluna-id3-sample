/* 
 * @(#)TriAppController.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app;

import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Generated;
import org.springframework.ui.Model;
import com.tri.app.TriAppHelper;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

/**
 * The Controller class of TriApp.
 */
@Controller
@RequestMapping("/")
public class TriAppController {

    @Inject
    TriAppHelper triAppHelper;

    @ModelAttribute
    public TriAppForm setUpForm() {
        TriAppForm form = new TriAppForm();
        return form;
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "menu", method = { RequestMethod.GET })
    public String showMenu(TriAppForm form, Model model) {
        return "menuPage";
    }
}