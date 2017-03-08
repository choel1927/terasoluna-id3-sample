/* 
 * @(#)CommonFlowController.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.commonflow;

import com.tri.domain.service.commonflow.ReturncallerOutputBean;
import com.tri.domain.service.commonflow.ReturncallerInputBean;
import com.tri.domain.service.commonflow.IdentityOutputBean;
import com.tri.domain.service.commonflow.IdentityInputBean;
import com.tri.domain.service.commonflow.CommonFlowService;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Generated;
import org.springframework.ui.Model;
import com.tri.app.TriAppHelper;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

/**
 * The Controller class of CommonFlow.
 */
@Controller
@RequestMapping("CommonFlow")
@SessionAttributes(value = { "subflow.CommonFlowScreenFlow.caller" })
public class CommonFlowController {

    @Inject
    TriAppHelper triAppHelper;

    @ModelAttribute
    public CommonFlowForm setUpForm() {
        CommonFlowForm form = new CommonFlowForm();
        return form;
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "identity", method = { RequestMethod.GET })
    public String identity(CommonFlowForm form, Model model) {
        IdentityInputBean input = new IdentityInputBean();
        input.setLicenseType((Integer)model.asMap().get("licenseType"));
        IdentityOutputBean output = commonFlowService.identity(input);
        form.setLicenseType(output.getLicenseType());
        return "CommonFlow/P001";
    }

    @Inject
    CommonFlowService commonFlowService;

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "returncaller", method = { RequestMethod.POST })
    public String returncaller(CommonFlowForm form, Model model, SessionStatus sessionStatus) {
        ReturncallerInputBean input = new ReturncallerInputBean();
        input.setName(form.getName());
        input.setPhone(form.getPhone());
        input.setEmail(form.getEmail());
        input.setAddress(form.getAddress());
        input.setLicenseType(form.getLicenseType());
        ReturncallerOutputBean output = commonFlowService.returncaller(input);
        form.setName(output.getName());
        form.setPhone(output.getPhone());
        form.setEmail(output.getEmail());
        form.setAddress(output.getAddress());
        form.setLicenseType(output.getLicenseType());

        sessionStatus.setComplete();
        return "forward:" + triAppHelper.getViewNameForContext((String) model.asMap().get("subflow.CommonFlowScreenFlow.caller")+"::Z002");
    }
}