package ca.gbc.comp3095.petclinic.services;


import java.util.Set;

public interface CrudService<T, ID> {

    // crud Service is a generic(common) interface
    // implement to consolidate the logics with the services created
    // all services should inherit from crud service

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete (T object);
    void deleteById(ID id);


}
