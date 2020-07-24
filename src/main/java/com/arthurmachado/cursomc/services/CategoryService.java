package com.arthurmachado.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthurmachado.cursomc.domains.Category;
import com.arthurmachado.cursomc.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository; 
	
	public Category search(Integer id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.orElse(null);
	}
}
