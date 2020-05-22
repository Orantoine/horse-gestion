package fr.orantoine.horsegestion.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.orantoine.horsegestion.Utils.ConvertToDto;
import fr.orantoine.horsegestion.dtos.UserDto;
import fr.orantoine.horsegestion.entities.User;
import fr.orantoine.horsegestion.repositories.UserRepository;
import fr.orantoine.horsegestion.services.UserService;


@Service
public class UserServiceImpl implements UserService{


    private ConvertToDto toDto = new ConvertToDto();

    @Autowired
    private UserRepository userRepository;

	public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        if(userList != null){
            List<UserDto> userDtos = new ArrayList<>();
            for(User user : userList){
                userDtos.add(toDto.UserToUserDto(user));
            }
            return userDtos;
        }   
		return null;
	}
}