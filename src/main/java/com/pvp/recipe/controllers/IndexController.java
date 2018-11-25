package com.pvp.recipe.controllers;

import com.pvp.recipe.model.Category;
import com.pvp.recipe.model.UnitOfMeasure;
import com.pvp.recipe.repository.CategoryRepository;
import com.pvp.recipe.repository.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class IndexController {

    private UnitOfMeasureRepository unitOfMeasureRepository;
    private CategoryRepository categoryRepository;

    public IndexController(UnitOfMeasureRepository unitOfMeasureRepository, CategoryRepository categoryRepository) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {

        Optional <Category> categoryOptional = this.categoryRepository.findByDescription("Indian");
        Optional <UnitOfMeasure> unitOfMeasureOPtional = this.unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id : " + categoryOptional.get().getId());
        System.out.println("UOM id : " +  unitOfMeasureOPtional.get().getId());

        return "index";

    }
}
