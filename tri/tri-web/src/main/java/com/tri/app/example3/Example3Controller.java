/* 
 * @(#)Example3Controller.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example3;

import com.tri.app.TriAppHelper;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

/**
 * The Controller class of example3.
 */
@Controller
@RequestMapping("example3")
public class Example3Controller {

    @Inject
    TriAppHelper triAppHelper;

    @ModelAttribute
    public Example3Form setUpForm() {
        Example3Form form = new Example3Form();
        return form;
    }
}