package tr.edu.yildiz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.edu.yildiz.dao.CategoryDao;
import tr.edu.yildiz.domain.Category;
import tr.edu.yildiz.service.CategoryService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void saveCategory(String categoryName) {
        Category category = new Category();
        category.setCategoryName(categoryName);

        categoryDao.saveOrUpdate(category);
    }

    @Override
    public List<Category> getCategories() {
        return categoryDao.findAll();
    }
}
