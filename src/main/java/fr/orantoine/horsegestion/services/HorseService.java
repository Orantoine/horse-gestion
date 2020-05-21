package fr.orantoine.horsegestion.services;

import java.util.List;

import fr.orantoine.horsegestion.dtos.HorseDto;

public interface HorseService {

    public List<HorseDto> getAll();

}