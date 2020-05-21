package fr.orantoine.horsegestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.orantoine.horsegestion.dtos.HorseDto;
import fr.orantoine.horsegestion.entities.Horse;
import fr.orantoine.horsegestion.services.Impl.HorseServiceImpl;
import io.micrometer.core.ipc.http.HttpSender.Response;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HorseController {

    @Autowired
    private HorseServiceImpl horseService;


    @GetMapping("/horses")
    public ResponseEntity<List<HorseDto>> getAllHorse(){
        List<HorseDto> horses = horseService.getAll();
        return horses != null ? new ResponseEntity<>(horses,HttpStatus.OK) : new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

    }

    @PostMapping("/horses")
    public ResponseEntity<Void> saveHorse(@RequestBody HorseDto horseDto){
        Horse horse = horseService.saveHorse(horseDto);
        if(horse == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping("/horses/{id}")
    public ResponseEntity<HorseDto> getHorse(@PathVariable Long id) {
        HorseDto horseDto = horseService.getHorseById(id);
        return horseDto != null ? new ResponseEntity<>(horseDto,HttpStatus.OK) : new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    

}