package com.geekster.Receipe.Management.controller;


import com.geekster.Receipe.Management.model.Chef;
import com.geekster.Receipe.Management.service.ChefService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChefController {


    @Autowired
    ChefService chefService;

    @PostMapping()
    public Chef createChef(@Valid @RequestBody Chef chef) {
        return chefService.saveChef(chef);
    }


    @GetMapping("/{dishId}")
    public Chef getChefBydishId(@PathVariable Long dishId) {
        return chefService.getChefBydishId(dishId);
    }

    @GetMapping
    public List<Chef> getAllChefs() {
        return chefService.getAllchefs();
    }

    @DeleteMapping("/{dishId}")
    public void deleteChef(@PathVariable Long dishId) {
        chefService.deleteChef(dishId);
    }


}
