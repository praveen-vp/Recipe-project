package com.pvp.recipe.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author praveen-vp
 * 15/1/19
 * com.pvp.recipe.model
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void setId() {
        Long idValue = 3L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void setDescription() {
        String description = "Hi Hi";
        category.setDescription(description);
        assertEquals(description, category.getDescription());
    }
}