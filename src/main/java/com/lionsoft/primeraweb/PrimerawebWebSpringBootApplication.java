package com.lionsoft.primeraweb;

import com.lionsoft.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimerawebWebSpringBootApplication {
	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(PrimerawebWebSpringBootApplication.class, args);
	}

	/*
	@Override
	public void run(String ...arg) throws  Exception{
		personaService.crearPersona(new Persona(1L, "Ferney", 23));
		personaService.crearPersona(new Persona(2L, "wilhen", 23));
		personaService.crearPersona(new Persona(3L, "karen", 23));
		personaService.crearPersona(new Persona(4L, "rocio", 23));

		System.out.println("Cantidad de personas creadas"+ personaService.contarPersonas());
		List<Persona> personas = personaService.obtenerPersonas();
		personas.forEach(p -> System.out.println("nombre: "+p.getNombre()));

	}
**/
}
