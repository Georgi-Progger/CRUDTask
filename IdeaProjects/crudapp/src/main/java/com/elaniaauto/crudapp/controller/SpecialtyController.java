package com.elaniaauto.crudapp.controller;

import com.elaniaauto.crudapp.model.Specialty;
import com.elaniaauto.crudapp.repository.SpecialtyRepository;
import com.elaniaauto.crudapp.repository.gson.GsonSpecialtyImpl;

import java.util.List;

public class SpecialtyController {
    private SpecialtyRepository specialtyRepository = new GsonSpecialtyImpl();

    public Specialty create(Specialty specialty){
        specialtyRepository.save(specialty);
        return specialty;
    }


    public List<Specialty> readAll(){
        return specialtyRepository.getAll();
    }

    public void update(Specialty specialty){
        specialtyRepository.update(specialty);
    }

    public void delete(Integer id){
        specialtyRepository.deleteById(id);
    }
}
