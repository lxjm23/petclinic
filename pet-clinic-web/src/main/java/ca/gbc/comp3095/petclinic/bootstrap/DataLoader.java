package ca.gbc.comp3095.petclinic.bootstrap;


import ca.gbc.comp3095.petclinic.model.Owner;
import ca.gbc.comp3095.petclinic.model.Veterinarian;
import ca.gbc.comp3095.petclinic.services.OwnerService;
import ca.gbc.comp3095.petclinic.services.VeterinarianService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    // final becomes final after first initialization
    // dependencies should not change
    private final OwnerService ownerService;
    private final VeterinarianService veterinarianService;

    public DataLoader(OwnerService ownerService, VeterinarianService veterinarianService) {
        this.ownerService = ownerService;
        this.veterinarianService = veterinarianService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstname("Bruce");
        owner1.setLastname("Wayne");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Peter");
        owner2.setLastname("Parker");
        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Veterinarian vet1 = new Veterinarian();
        vet1.setFirstname("Diana");
        vet1.setLastname("Prince");
        veterinarianService.save(vet1);

        Veterinarian vet2 = new Veterinarian();
        vet2.setFirstname("Bruce");
        vet2.setLastname("Banner");
        veterinarianService.save(vet2);

        System.out.println("Loaded Vets");
    }
}
