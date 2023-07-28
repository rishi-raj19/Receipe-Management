package com.geekster.Receipe.Management.service;


import com.geekster.Receipe.Management.model.Learner;
import com.geekster.Receipe.Management.repository.IChefRepo;
import com.geekster.Receipe.Management.repository.ILearnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearnerService {

    @Autowired
    ILearnerRepo learnRepo;
    public Learner saveLearner(Learner learner) {
        return learnRepo.save(learner);
    }
}
