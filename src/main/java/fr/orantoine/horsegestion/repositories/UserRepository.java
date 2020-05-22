package fr.orantoine.horsegestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orantoine.horsegestion.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}