package com.LibraryManagement.demo.service;

import com.LibraryManagement.demo.entity.Category;
import com.LibraryManagement.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    public Category findCategoryById(Long id){
        Category category= categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category Not Found!!"));
        return category;
    }

    public void createCategory(Category category){
        categoryRepository.save(category);
    }

    public void deleteCategoryById(Long id){
        Category category= categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category Not found to delete!!"));
        categoryRepository.deleteById(category.getId());
    }

    public Category updateCategoryById(Long Id, Category newCategory){
        Category category= categoryRepository.findById(Id).orElseThrow(()-> new RuntimeException("Category with this id not found!!"));
        category.setName(newCategory.getName());
        return category;
    }

    public void updateCategory(Category category){
        categoryRepository.save(category);
    }
}
