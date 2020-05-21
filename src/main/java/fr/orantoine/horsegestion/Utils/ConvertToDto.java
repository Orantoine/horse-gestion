package fr.orantoine.horsegestion.Utils;

import fr.orantoine.horsegestion.dtos.HorseDto;
import fr.orantoine.horsegestion.entities.Horse;
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

}