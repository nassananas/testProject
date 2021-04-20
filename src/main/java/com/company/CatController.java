package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cat")

public class CatController {

    private CatService service;

    @Autowired
    public void setService(CatService service) {
        this.service = service;
    }

    @PostMapping("/new")
    public String newCat(@RequestBody Cat cat) {
        service.saveCat(cat);
        return "new";
    }

    @PostMapping("/getCat")
    public Cat getCat(@RequestParam Integer id) {
        return service.getCatById(id);
    }

}