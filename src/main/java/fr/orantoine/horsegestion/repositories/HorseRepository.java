package fr.orantoine.horsegestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orantoine.horsegestion.entities.Horse;

public interface HorseRepository extends JpaRepository<Horse,Long>{

}