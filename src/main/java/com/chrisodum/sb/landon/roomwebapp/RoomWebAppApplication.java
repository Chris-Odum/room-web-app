package com.chrisodum.sb.landon.roomwebapp;

import com.chrisodum.sb.landon.roomwebapp.data.StaffRepository;
import com.chrisodum.sb.landon.roomwebapp.models.Position;
import com.chrisodum.sb.landon.roomwebapp.models.Room;
import com.chrisodum.sb.landon.roomwebapp.models.Staff;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.PrePersist;
import java.util.UUID;

@SpringBootApplication
public class RoomWebAppApplication {


//test method to see if I could add a staff member to database
//	@Bean
//	public CommandLineRunner commandLineRunner(StaffRepository staffRepository) throws Exception{
//	UUID id =  UUID.randomUUID();
//		 return args -> {
//			Staff Darthsookious = new Staff("1648f628-af4e-416c-9a56-a33f6240301a", "Sookious","Darth", Position.SECURITY);
//
//			staffRepository.save(Darthsookious);
//
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(RoomWebAppApplication.class, args);
	}

}
