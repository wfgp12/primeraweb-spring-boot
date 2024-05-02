package com.lionsoft.primeraweb.repositories;

import com.lionsoft.primeraweb.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Persona, Long> {
}
