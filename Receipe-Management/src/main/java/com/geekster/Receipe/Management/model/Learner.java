package com.geekster.Receipe.Management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Learner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dishId;

    @ManyToOne
    @JoinColumn(name = "fk_chef_dishId")
    private Chef chef;

    @NotBlank(message = "Comment is required")
    private String comment;
}
