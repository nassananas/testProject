package com.company;

import java.util.Optional;

public interface CatService {
    Cat getCatById(Integer id);
    void saveCat(Cat cat);
}
