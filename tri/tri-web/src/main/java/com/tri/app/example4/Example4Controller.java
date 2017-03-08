/* 
 * @(#)Example4Controller.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example4;

import com.tri.domain.service.example4.InputidentityOutputBean;
import com.tri.domain.service.example4.InputidentityInputBean;
import com.tri.domain.service.example4.Example4Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.PostConstruct;
import javax.annotation.Generated;
import org.springframework.ui.Model;
import com.tri.app.TriAppHelper;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

/**
 * The Controller class of Example4.
 */
@Controller
@RequestMapping("Example4")
public class Example4Controller {

    @Inject
    TriAppHelper triAppHelper;

    @ModelAttribute
    public Example4Form setUpForm() {
        Example4Form form = new Example4Form();
        return form;
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "inputlicense", method = { RequestMethod.GET })
    public String inputlicense(Example4Form form, Model model) {
        return "Example4/P001";
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "inputidentity", method = { RequestMethod.POST })
    public String inputidentity(Example4Form form, Model model, RedirectAttributes redirectAttributes) {
        InputidentityInputBean input = new InputidentityInputBean();
        input.setLicenseType(triAppHelper.map(form.getLicenseType(), Integer.class));
        InputidentityOutputBean output = example4Service.inputidentity(input);
        form.setLicenseType(triAppHelper.map(output.getLicenseType(), Integer.class));
        redirectAttributes.addFlashAttribute("subflow.CommonFlowScreenFlow.caller", "Example4ScreenFlow::CF001");
        return "redirect:/CommonFlow/identity";
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "decision", method = { RequestMethod.POST })
    public String decision(Example4Form form, Model model) {
        if (false) {
            return "Example4/Page03";
        }
        return "Example4/Page02";
    }

    @Inject
    Example4Service example4Service;

    @PostConstruct
    public void configureSubflow() {
        triAppHelper.setViewNameForContext("Example4ScreenFlow::CF001::Z002", "/Example4/decision");
    }
}