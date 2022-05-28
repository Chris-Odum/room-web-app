package com.chrisodum.sb.landon.roomwebapp.data;

import com.chrisodum.sb.landon.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository uses generics for the Type of object in db and the type of its id
public interface RoomRepository extends JpaRepository<Room,Long> {


}
