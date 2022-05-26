package com.chrisodum.sb.landon.roomwebapp.controllers;

import com.chrisodum.sb.landon.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {



    private final StaffService staffservice;
    
   public StaffController(StaffService staffService){
        this.staffservice = staffService;
    }


    @GetMapping
    public String getStaff(Model model) {

        
        model.addAttribute("employees", staffservice.getAllStaff());

        return "staff";

    }
}
