package com.geekster.Receipe.Management.repository;

import com.geekster.Receipe.Management.model.Chef;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChefRepo extends JpaRepository<Chef, Long> {
}
