package fr.orantoine.horsegestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.orantoine.horsegestion.dtos.UserDto;
import fr.orantoine.horsegestion.repositories.UserRepository;
import fr.orantoine.horsegestion.services.Impl.UserServiceImpl;

@RestController
public class UserController {


    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> userList = userService.getAllUsers();
        return userList != null ? new ResponseEntity<>(userList,HttpStatus.OK) : new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }

}