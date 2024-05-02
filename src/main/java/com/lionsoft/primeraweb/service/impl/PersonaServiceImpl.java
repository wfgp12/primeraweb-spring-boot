package com.lionsoft.primeraweb.service.impl;

import com.lionsoft.primeraweb.entities.Persona;
import com.lionsoft.primeraweb.repositories.PersonRepository;
import com.lionsoft.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonRepository personaRepository;

    @Override
    public List<Persona> obtenerPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }


    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona perdoDB = personaRepository.findById(id).orElse(null);
        if (persona != null){
            perdoDB.setNombre(persona.getNombre());
            perdoDB.setEdad(persona.getEdad());

            return personaRepository.save(perdoDB);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }
}
