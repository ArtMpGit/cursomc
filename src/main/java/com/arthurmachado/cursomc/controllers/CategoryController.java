package com.arthurmachado.cursomc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthurmachado.cursomc.domains.Category;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {
	
	@GetMapping(value="")
	public List<Category> list() {
		
		Category cat1 = new Category(1, "Informática");
		Category cat2 = new Category(2, "Escritório");
		
		ArrayList<Category> categoryList = new ArrayList<>();
		
		categoryList.add(cat1);
		categoryList.add(cat2);
		
		return categoryList;
	}
}
