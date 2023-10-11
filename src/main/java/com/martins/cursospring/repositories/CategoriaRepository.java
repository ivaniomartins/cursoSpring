package com.martins.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.martins.cursospring.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {
	
	

}
