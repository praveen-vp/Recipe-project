package com.pvp.recipe.service;

import com.pvp.recipe.model.Recipe;
import com.pvp.recipe.repository.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

/**
 * @author praveen-vp
 * 15/1/19
 * com.pvp.recipe.service
 */
public class RecipeServiceImpTest {

    RecipeServiceImp recipeService;

    @Mock
    RecipeRepository recipeRepository;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImp(recipeRepository);
    }

    @Test
    public void getRecipes() {

        Recipe recipe = new Recipe();
        HashSet recipeData = new HashSet();
        recipeData.add(recipe);

        Mockito.when(recipeService.getRecipes()).thenReturn(recipeData);
        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 1);
        Mockito.verify(recipeRepository, times(1)).findAll();

    }
}