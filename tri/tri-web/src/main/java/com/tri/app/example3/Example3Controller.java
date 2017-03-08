/* 
 * @(#)Example3Controller.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example3;

import com.tri.domain.service.example3.DecisionOutputBean;
import com.tri.domain.service.example3.DecisionInputBean;
import com.tri.domain.service.example3.Example3Service;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import javax.annotation.Generated;
import com.tri.app.TriAppHelper;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

/**
 * The Controller class of example3.
 */
@Controller
@RequestMapping("Example3")
public class Example3Controller {
	
    @Inject
    TriAppHelper triAppHelper;

    @ModelAttribute
    public Example3Form setUpForm() {
        Example3Form form = new Example3Form();
        return form;
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "main", method = { RequestMethod.GET })
    public String main(Example3Form form, Model model) {
        return "Example3/P001";
    }

    @Inject
    Example3Service example3Service;

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "decision", method = { RequestMethod.POST })
    public String decision(Example3Form form, Model model) {
        DecisionInputBean input = new DecisionInputBean();
        input.setPageDropdown(form.getPageDropdown());
        DecisionOutputBean output = example3Service.decision(input);
        form.setPageDropdown(output.getPageDropdown());
        if (false) {
            return "Example3/P003";
        }
        return "Example3/P002";
    }
}