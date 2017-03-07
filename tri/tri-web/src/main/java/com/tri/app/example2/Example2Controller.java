/* 
 * @(#)Example2Controller.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.example2;

import com.tri.domain.service.example2.DeleteOutputBean;
import com.tri.domain.service.example2.DeleteInputBean;
import com.tri.domain.service.example2.AddOutputBean;
import com.tri.domain.service.example2.AddInputBean;
import com.tri.app.example2.ItemList;
import com.tri.domain.service.example2.ListOutputBean;
import com.tri.domain.service.example2.ListInputBean;
import com.tri.domain.service.example2.Example2Service;
import com.tri.app.TriAppHelper;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Generated;
import org.springframework.ui.Model;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

/**
 * The Controller class of Example2.
 */
@Controller
@RequestMapping("Example2")
public class Example2Controller {

    @ModelAttribute
    public Example2Form setUpForm() {
        Example2Form form = new Example2Form();
        return form;
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "list", method = { RequestMethod.GET })
    public String list(Example2Form form, Model model) {
        ListInputBean input = new ListInputBean();
        ListOutputBean output = example2Service.list(input);
        model.addAttribute("itemList", triAppHelper.mapListToList(output.getItemList(), ItemList.class));
        return "Example2/P001";
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "add", method = { RequestMethod.POST })
    public String add(Example2Form form, Model model, RedirectAttributes redirectAttributes) {
        AddInputBean input = new AddInputBean();
        input.setItemName(form.getItemName());
        AddOutputBean output = example2Service.add(input);
        redirectAttributes.addFlashAttribute("itemList", triAppHelper.mapListToList(output.getItemList(), ItemList.class));
        return "redirect:/Example2/list";
    }

    @Inject
    TriAppHelper triAppHelper;

    @Inject
    Example2Service example2Service;

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "delete", method = { RequestMethod.GET })
    public String delete(Example2Form form, Model model, RedirectAttributes redirectAttributes) {
        DeleteInputBean input = new DeleteInputBean();
        input.setItemId(form.getItemId());
        DeleteOutputBean output = example2Service.delete(input);
        redirectAttributes.addFlashAttribute("itemList", triAppHelper.mapListToList(output.getItemList(), ItemList.class));
        return "redirect:/Example2/list";
    }
}