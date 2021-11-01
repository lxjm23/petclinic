package ca.gbc.comp3095.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    // associates pet to petType and Owner
    private PetType petType;
    private Owner owner;
    private LocalDate birthdate;

}
