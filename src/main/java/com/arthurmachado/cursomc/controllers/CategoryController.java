package com.arthurmachado.cursomc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthurmachado.cursomc.domains.Category;
import com.arthurmachado.cursomc.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> find(@PathVariable Integer id) {
		
		Category category = categoryService.search(id);
		
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}
	
	
}
