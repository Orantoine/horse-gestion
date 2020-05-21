package fr.orantoine.horsegestion.services;

import java.util.List;

import fr.orantoine.horsegestion.dtos.HorseDto;
import fr.orantoine.horsegestion.entities.Horse;

public interface HorseService {

    public List<HorseDto> getAll();

    public Horse saveHorse(HorseDto horseDto);

    public HorseDto getHorseById(Long id);

}