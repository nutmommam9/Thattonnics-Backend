package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	Category findByName(String name);
	
	Boolean existsByName(String name);

}
