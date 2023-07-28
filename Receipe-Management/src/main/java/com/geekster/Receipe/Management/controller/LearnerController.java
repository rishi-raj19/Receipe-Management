package com.geekster.Receipe.Management.controller;

import com.geekster.Receipe.Management.model.Learner;
import com.geekster.Receipe.Management.service.ChefService;
import com.geekster.Receipe.Management.service.LearnerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LearnerController {

    @Autowired
    LearnerService learnerService;

    @PostMapping
    public Learner Learner(@Valid @RequestBody Learner learner) {
        return learnerService.saveLearner(learner);
    }
}
