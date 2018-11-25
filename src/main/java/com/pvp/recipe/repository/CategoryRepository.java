package com.pvp.recipe.repository;

import com.pvp.recipe.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * prvaeen vp
 * 25-11-2018
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
