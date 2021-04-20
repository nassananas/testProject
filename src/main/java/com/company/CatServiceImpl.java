package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatServiceImpl implements CatService{
    private CatRepository repository;

    @Autowired
    public void setRepository(CatRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cat getCatById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveCat(Cat cat) {
        repository.save(cat);
    }

}
