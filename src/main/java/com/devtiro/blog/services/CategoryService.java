package com.devtiro.blog.services;

import java.util.List;

import com.devtiro.blog.domain.entities.Category;

public interface CategoryService {
    List<Category> listCategories();

    Category createCategory(Category category);
}
