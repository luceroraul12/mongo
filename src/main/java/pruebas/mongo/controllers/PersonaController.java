package pruebas.mongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pruebas.mongo.entities.Persona;
import pruebas.mongo.repositories.Personarepository;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    Personarepository personarepository;

    @GetMapping
    public List<Persona> obtenerPersonas(){
        return personarepository.findAll();
    }

    @PostMapping
    public String cargarPersona(){
        personarepository.save(new Persona("Raul", 23423749));
        return "Persona cargada";
    }
}
