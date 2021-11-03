package ca.gbc.comp3095.petclinic.services.map;

import ca.gbc.comp3095.petclinic.model.Veterinarian;
import ca.gbc.comp3095.petclinic.services.CrudService;

import java.util.Set;

public class VeterinarianServiceMap extends AbstractMapService<Veterinarian, Long> implements CrudService<Veterinarian, Long> {

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
        return super.save(object.getId(), object);
    }

    @Override
    public Veterinarian findById(Long id) {
        return super.findById(id);
    }
}
