package com.geekster.Receipe.Management.service;


import com.geekster.Receipe.Management.model.Chef;
import com.geekster.Receipe.Management.repository.IChefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ChefService {
    @Autowired
    IChefRepo chefRepo;

    public Chef saveChef(Chef chef) {
        return chefRepo.save(chef);
    }

    public Chef getChefBydishId(Long dishId) {
        return chefRepo.findById(dishId).orElse(null);
    }

    public List<Chef> getAllchefs() {
        return chefRepo.findAll();
    }

    public void deleteChef(Long dishId) {
        chefRepo.deleteById(dishId);
    }
}
