package fr.orantoine.horsegestion.services;

import java.util.List;

import fr.orantoine.horsegestion.dtos.UserDto;

public interface UserService {

    public List<UserDto> getAllUsers();

}