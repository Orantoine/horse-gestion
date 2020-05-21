package fr.orantoine.horsegestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.orantoine.horsegestion.dtos.HorseDto;
import fr.orantoine.horsegestion.services.Impl.HorseServiceImpl;

@RestController
public class HorseController {

    @Autowired
    private HorseServiceImpl horseService;


    @GetMapping("/horses")
    public ResponseEntity<List<HorseDto>> getAllHorse(){
        List<HorseDto> horses = horseService.getAll();
        return horses != null ? new ResponseEntity<>(horses,HttpStatus.OK) : new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

    }

}