package com.chrisodum.sb.landon.roomwebapp.service;

import com.chrisodum.sb.landon.roomwebapp.data.StaffRepository;
import com.chrisodum.sb.landon.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {


    private static final List<Staff> employees = new ArrayList<>();

    private StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository){
        this.staffRepository = staffRepository;
    }
//
//    static {
            //all IO stuff throws IOException
//        try {

            //create a file object from the dir to the file(note this just stores the location of file
            //not the file itself
//            File nf = new File("C:\\Users\\actua\\OneDrive\\Desktop\\nf\\td.txt");

//            FileReader fr = new FileReader(nf);
//            BufferedReader br = new BufferedReader(fr);
//
//
//            String line = null;
//            String lineTwo = null;
//
//            while ((line = br.readLine()) != null) {
//                lineTwo = line;
//            }
//
//            String[] star = lineTwo.split(",");
//
//            for (int i = 0; i < star.length; i += 4) {
//                employees.add(new Staff(star[i], star[i + 1], star[i + 2], star[i + 3]));
//
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    //}

    public List<Staff> getAllStaff(){

        return staffRepository.findAll();
    }
}

