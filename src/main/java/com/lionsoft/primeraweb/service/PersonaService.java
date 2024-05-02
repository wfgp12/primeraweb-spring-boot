package com.lionsoft.primeraweb.service;

import com.lionsoft.primeraweb.entities.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerPersonas();
    Persona obtenerPersona(Long id);
    Persona crearPersona(Persona persona);
    Persona actualizarPersona(Long id, Persona persona);
    void eliminarPersona(Long id);
    long contarPersonas();
}
