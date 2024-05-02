package com.lionsoft.primeraweb.controller;

import com.lionsoft.primeraweb.entities.Persona;
import com.lionsoft.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    // La clase model se utiliza para transferir objetos del controller a la vista
    @GetMapping
    public String listarPersonas(Model model){
        List<Persona> personas = personaService.obtenerPersonas();
        model.addAttribute("personas", personas);
        return "listar";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaPersona(Model model) {
        model.addAttribute("persona", new Persona());
        model.addAttribute("action", "/personas/nueva");
        return "formulario";
    }

    @PostMapping("/nueva")
    public String crearPersona(@ModelAttribute Persona persona){
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable long id, @ModelAttribute Persona persona, Model model) {
        model.addAttribute("persona", persona);
        model.addAttribute("action", "/personas/editar/"+id);
        return "formulario";
    }

    @PostMapping("/editar/{id}")
    public String actualizarPersona(@PathVariable long id, @ModelAttribute Persona persona){
        personaService.actualizarPersona(id, persona);
        return "redirect:/personas";
    }

}
