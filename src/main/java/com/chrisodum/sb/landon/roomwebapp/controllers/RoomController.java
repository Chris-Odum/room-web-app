package com.chrisodum.sb.landon.roomwebapp.controllers;


import com.chrisodum.sb.landon.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController (RoomService roomService){

        this.roomService = roomService;
    }



    @GetMapping
    public String getAllRooms(Model model){
        //note that "rooms" on the left, matches the name we use in thymeleaf tempalate engine it routes to
        //rooms on the right is the array created above
        model.addAttribute("rooms",roomService.getAllRooms());

        //note the name being returned is the name of the view that this method resolves/corresponds to
        return "rooms";
    }

}
