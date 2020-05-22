package fr.orantoine.horsegestion.dtos;

import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String pseudo;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

}