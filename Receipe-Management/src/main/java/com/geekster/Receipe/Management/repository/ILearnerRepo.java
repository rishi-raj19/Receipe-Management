package com.geekster.Receipe.Management.repository;

import com.geekster.Receipe.Management.model.Learner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILearnerRepo extends JpaRepository<Learner, Long> {
}
