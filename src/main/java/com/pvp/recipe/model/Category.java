package com.pvp.recipe.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * praveen vp
 * 24/10/18
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories", fetch = FetchType.EAGER)
    private Set<Recipe> recipes = new HashSet<>();

}
