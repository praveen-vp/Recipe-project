package com.pvp.recipe.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * praveen vp
 * 24/10/18
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
