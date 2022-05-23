package com.chrisodum.sb.landon.roomwebapp.controllers;


import com.chrisodum.sb.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private static final List<Room> rooms = new ArrayList<>();
    //this is a static block.
    //it is executed when the class is loaded.
    //it can be thought of as a class constructor.
    static {
        for(int i = 0; i < 10; i++){
            rooms.add(new Room(i, "Room " + i, "R " + i, "Q"));
        }
    }

    @GetMapping
    public String getAllRooms(Model model){
        //note that "rooms" on the left, matches the name we use in thymeleaf tempalate engine it routes to
        //rooms on the right is the array created above
        model.addAttribute("rooms",rooms);

        //note the name being returned is the name of the view that this method resolves/corresponds to
        return "rooms";
    }

}
