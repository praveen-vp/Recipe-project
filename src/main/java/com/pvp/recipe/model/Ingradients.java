package com.pvp.recipe.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingradients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private RecipeObj recipeObj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public RecipeObj getRecipeObj() {
        return recipeObj;
    }

    public void setRecipeObj(RecipeObj recipeObj) {
        this.recipeObj = recipeObj;
    }
}
