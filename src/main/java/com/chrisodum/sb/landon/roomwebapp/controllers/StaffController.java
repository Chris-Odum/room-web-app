package com.chrisodum.sb.landon.roomwebapp.controllers;

import com.chrisodum.sb.landon.roomwebapp.models.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private static final List<Staff> employees = new ArrayList<>();

    static {
        try{
            File nf = new File("C:\\Users\\actua\\OneDrive\\Desktop\\nf\\td.txt");
            FileReader fr = new FileReader(nf);
            BufferedReader br = new BufferedReader(fr);


            String line = null;
            String lineTwo = null;

        while((line = br.readLine()) != null){
            lineTwo = line;
        }

            String[] star = lineTwo.split(",");

            for(int i = 0; i < star.length; i += 4){
                employees.add(new Staff(star[i], star[i+1], star[i+2],star[i+3]));


            }

        }catch(IOException e){
           e.printStackTrace();
        }

//        employees.add(new Staff("9f717667-505a-4074-ba43-ceae2c0e9f4b", "Adams", "Roy", "HOUSEKEEPING"));
//        employees.add(new Staff("6f717444-505a-4074-ba43-ceae2c0e9f4b", "roe", "moe", "HOUSEKEEPING"));
//        employees.add(new Staff("4f717444-505a-4074-ba43-ceae2c0e9f4b", "Tams", "Roy", "secretary"));
//        employees.add(new Staff("5f717444-505a-4074-ba43-ceae2c0e9f4b", "A", "Ry", "HOUSEKEEPING"));
//        employees.add(new Staff("2f717444-505a-4074-ba43-ceae2c0e9f4b", "Ada", "oy", "engineer"));
//        employees.add(new Staff("1f717444-505a-4074-ba43-ceae2c0e9f4b", "Aams", "y", "HOUSEKEEPING"));
//        employees.add(new Staff("3f717444-505a-4074-ba43-ceae2c0e9f4b", "Ads", "Roy", "electrician"));


    }

    @GetMapping
    public String getAllStaff(Model model) {

        model.addAttribute("employees", employees);

        return "staff";

    }
}
