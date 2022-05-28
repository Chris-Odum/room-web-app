package com.chrisodum.sb.landon.roomwebapp.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "employee")
public class Staff {

    @Id
    @Column(name = "EMPLOYEE_ID")
    //@GeneratedValue is not set here because the GUID is used as the unique identifier
    //and a new one is generated as part of the construction of each new Staff member.
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Enumerated(EnumType.STRING)
    @Column(name = "POSITION")
    private Position position;


    public Staff(){
        this.id = UUID.randomUUID().toString();
    }

    public Staff(String id, String lastName, String firstName, Position position) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}


