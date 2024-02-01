package com.martins.cursospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martins.cursospring.models.Categoria;
import com.martins.cursospring.repositories.CategoriaRepository;

@Service	
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository;

	
     public Categoria buscar(Integer id) {
    	Optional<Categoria> obj = repository.findById(id);
          	 
    	 return obj.orElse(null);
    	 
     }
     
 	public Iterable<Categoria> buscarTodos(){
		
 		return repository.findAll();
 			
 		}
	
	
}


