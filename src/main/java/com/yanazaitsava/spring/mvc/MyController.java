package com.yanazaitsava.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/") //  ../employee/
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails") //  ../employee/askDetails
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }


    @RequestMapping("/showDetails")//  ../employee/showDetails
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {


        empName = "Ms. " + empName+" =) ";
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - Udemy student ");

        return "show-emp-details-view";
    }

}
