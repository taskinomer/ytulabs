package tr.edu.yildiz.service;

import tr.edu.yildiz.domain.Category;

import java.util.List;

public interface CategoryService {

    void saveCategory(String categoryName);

    List<Category> getCategories();
}
