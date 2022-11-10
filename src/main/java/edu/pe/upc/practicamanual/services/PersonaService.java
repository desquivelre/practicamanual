package edu.pe.upc.practicamanual.services;

import edu.pe.upc.practicamanual.entities.Persona;
import edu.pe.upc.practicamanual.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona create(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    public void delete(Persona persona) {
        personaRepository.delete(persona);
    }

    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }
}
