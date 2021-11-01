package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.model.Veterinarian;

import java.util.Set;

public interface VetService {

    Veterinarian findById(Long id);
    Veterinarian save(Veterinarian vet);
    Set<Veterinarian> findAll();
}
