/* 
 * @(#)TodoManagementController.java
 *
 * Copyright (c) 2015, NTT DATA CORPORATION
 * All rights reserved.
 */

package com.tri.app.todomanagement;

import com.tri.app.todomanagement.Todos;
import com.tri.domain.service.todomanagement.ListOutputBean;
import com.tri.domain.service.todomanagement.ListInputBean;
import com.tri.domain.service.todomanagement.AddOutputBean;
import com.tri.domain.service.todomanagement.AddInputBean;
import com.tri.domain.service.todomanagement.TodoManagementService;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.BindingResult;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.annotation.Generated;
import org.springframework.ui.Model;
import com.tri.app.TriAppHelper;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

/**
 * The Controller class of todoManagement.
 */
@Controller
@RequestMapping("todoManagement")
public class TodoManagementController {

    @Inject
    TriAppHelper triAppHelper;

    @ModelAttribute
    public TodoManagementForm setUpForm() {
        TodoManagementForm form = new TodoManagementForm();
        return form;
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "list", method = { RequestMethod.GET })
    public String list(TodoManagementForm form, Model model, Pageable pageable) {
        ListInputBean input = new ListInputBean();
        ListOutputBean output = todoManagementService.list(input);
        model.addAttribute("paginationLink", new PageImpl<Todos>((List<Todos>)model.asMap().get("todos"), pageable, (Long)model.asMap().get("totalCount")));
        return "todoManagement/todoManagementPage";
    }

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "add", method = { RequestMethod.POST })
    public String add(@Validated({ TodoManagementForm.Add.class }) TodoManagementForm form, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "todoManagement/todoManagementPage";
        }

        AddInputBean input = new AddInputBean();
        input.setTitle(form.getTitle());
        return "redirect:/todoManagement/list";
    }

    @Inject
    TodoManagementService todoManagementService;

    @Generated("TERASOLUNA IDE")
    @RequestMapping(value = "finish", method = { RequestMethod.POST })
    public String finish(TodoManagementForm form, Model model, RedirectAttributes redirectAttributes) {
        return "redirect:/todoManagement/list";
    }
}