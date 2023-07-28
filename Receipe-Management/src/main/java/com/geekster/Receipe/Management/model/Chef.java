package com.geekster.Receipe.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity



public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long dishId;

    @NotBlank(message = "Name is required")
    private String dishName;

    @NotBlank(message = "Ingredients are required")
    private String dishIngredients;

    @NotBlank(message = "Instructions are required")
    private String dishInstructions;

}
