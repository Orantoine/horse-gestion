package fr.orantoine.horsegestion.Utils;

import fr.orantoine.horsegestion.dtos.HorseDto;
import fr.orantoine.horsegestion.entities.Horse;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConvertToEntity {

    public Horse HorseDtoToHorse(HorseDto horseDto){
        if(horseDto != null){
            Horse horse = new Horse();
            horse.setId(horseDto.getId());
            horse.setName(horseDto.getName());
            horse.setObservation(horseDto.getObservation());
            return horse;
        }
        return null;
    }
}