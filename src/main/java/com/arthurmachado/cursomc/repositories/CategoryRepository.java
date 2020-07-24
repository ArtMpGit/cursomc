package com.arthurmachado.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arthurmachado.cursomc.domains.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
