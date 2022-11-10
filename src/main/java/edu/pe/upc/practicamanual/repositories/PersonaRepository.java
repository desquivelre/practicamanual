package edu.pe.upc.practicamanual.repositories;

import edu.pe.upc.practicamanual.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
