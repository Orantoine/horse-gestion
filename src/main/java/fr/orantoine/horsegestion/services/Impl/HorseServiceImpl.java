package fr.orantoine.horsegestion.services.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.orantoine.horsegestion.Utils.ConvertToDto;
import fr.orantoine.horsegestion.Utils.ConvertToEntity;
import fr.orantoine.horsegestion.dtos.HorseDto;
import fr.orantoine.horsegestion.entities.Horse;
import fr.orantoine.horsegestion.repositories.HorseRepository;
import fr.orantoine.horsegestion.services.HorseService;

@Service
public class HorseServiceImpl implements HorseService {

    private ConvertToDto toDto = new ConvertToDto();

    private ConvertToEntity toEntity = new ConvertToEntity();

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

    @Override
    public Horse saveHorse(HorseDto horseDto) {
        Horse horse = toEntity.HorseDtoToHorse(horseDto);
        horse = horseRepository.saveAndFlush(horse);
        return horse;
    }

    @Override
    public HorseDto getHorseById(Long id) {
        Optional<Horse> horseOpt = horseRepository.findById(id);
        if(horseOpt.isPresent()){
            Horse horse = horseOpt.get();
            return toDto.horseToHorseDto(horse);
        }
        return null;
    }

}