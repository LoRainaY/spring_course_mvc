package com.yanazaitsava.spring.mvc;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/") //  ../employee/
    public String showFirstView() {
        return "first-view";
    }


    @RequestMapping("/askDetails") //  ../employee/askDetails
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee",new Employee());
        return "ask-emp-details-view";
    }


    @RequestMapping("/showDetails")//  ../employee/showDetails
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp,
                                 BindingResult bindingResult) {// объект BindingResult хранит результат валидации

        if(bindingResult.hasErrors()){
            return "ask-emp-details-view";
        }
        else {
            return "show-emp-details-view";
        }
    }
}
