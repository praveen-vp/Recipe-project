package com.pvp.recipe.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class RecipeObj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String name;
    private int servings;
    private int prepTime;
    private int cookTime;

    @Lob
    private Byte[] image;

    // TODO add
    //private Difficulty difficulty;
    private String url;
    private String source;
    private int rating;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipeObj")
    private Set<Ingradients> ingradients;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Ingradients> getIngradients() {
        return ingradients;
    }

    public void setIngradients(Set<Ingradients> ingradients) {
        this.ingradients = ingradients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
}
