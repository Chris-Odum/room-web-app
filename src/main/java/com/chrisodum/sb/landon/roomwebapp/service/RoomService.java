package com.chrisodum.sb.landon.roomwebapp.service;

import com.chrisodum.sb.landon.roomwebapp.data.RoomRepository;
import com.chrisodum.sb.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service is a stereotype of @Component and tell spring
//that this class should be scanned for beans(objects) you want spring to manage
@Service
public class RoomService {

    private final RoomRepository roomRepository;

    //Spring will use this constructor to create and inject the RoomRepository object when its needed
    public RoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

  //  private static final List<Room> rooms = new ArrayList<>();
    //this is a static block.
    //it is executed when the class is loaded.
    //it can be thought of as a class constructor.
//    static {
//        for(int i = 0; i < 10; i++){
//            rooms.add(new Room(i, "Room " + i, "R " + i, "Q"));
//        }
//    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }


}
