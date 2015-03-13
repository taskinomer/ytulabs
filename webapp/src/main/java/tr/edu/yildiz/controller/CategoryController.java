package tr.edu.yildiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tr.edu.yildiz.domain.Category;
import tr.edu.yildiz.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getAllCategories() {
        return categoryService.getCategories();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public void getAllCategories(@RequestBody String categoryName) {
        categoryService.saveCategory(categoryName);
    }
}
