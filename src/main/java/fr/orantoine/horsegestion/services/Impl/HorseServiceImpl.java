package fr.orantoine.horsegestion.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.orantoine.horsegestion.Utils.ConvertToDto;
import fr.orantoine.horsegestion.dtos.HorseDto;
import fr.orantoine.horsegestion.entities.Horse;
import fr.orantoine.horsegestion.repositories.HorseRepository;
import fr.orantoine.horsegestion.services.HorseService;

@Service
public class HorseServiceImpl implements HorseService {

    private ConvertToDto toDto = new ConvertToDto();

    @Autowired
    private HorseRepository horseRepository;

    @Override
    public List<HorseDto> getAll() {

        List<Horse> horses = horseRepository.findAll();
        if(horses != null){
            List<HorseDto> horseDtos =new ArrayList<>();
            for(Horse horse: horses){
                horseDtos.add(toDto.horseToHorseDto(horse));
            }
            return horseDtos;
        }
        return null;
    }

}