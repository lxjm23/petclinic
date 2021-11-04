package ca.gbc.comp3095.petclinic.services.map;

import ca.gbc.comp3095.petclinic.model.Veterinarian;
import ca.gbc.comp3095.petclinic.services.VeterinarianService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VeterinarianServiceMap extends AbstractMapService<Veterinarian, Long> implements VeterinarianService {

    @Override
    public Set<Veterinarian> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Veterinarian object) {
        super.delete(object);
    }

    @Override
    public Veterinarian save(Veterinarian object) {
        return super.save(object);
    }

    @Override
    public Veterinarian findById(Long id) {
        return super.findById(id);
    }
}
