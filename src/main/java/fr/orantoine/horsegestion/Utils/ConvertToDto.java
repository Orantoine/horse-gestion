package fr.orantoine.horsegestion.Utils;

import fr.orantoine.horsegestion.dtos.HorseDto;
import fr.orantoine.horsegestion.dtos.UserDto;
import fr.orantoine.horsegestion.entities.Horse;
import fr.orantoine.horsegestion.entities.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConvertToDto {


    public HorseDto horseToHorseDto(Horse horse){
        HorseDto horseDto = new HorseDto();
        horseDto.setId(horse.getId());
        horseDto.setName(horse.getName());
        horseDto.setObservation(horse.getObservation());
        return horseDto;
    }

    public UserDto UserToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setAge(user.getAge());
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setPassword(user.getPassword());
        userDto.setPseudo(user.getPseudo());
        return userDto;
    }

}