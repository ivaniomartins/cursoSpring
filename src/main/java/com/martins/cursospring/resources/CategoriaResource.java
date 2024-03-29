package com.martins.cursospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.martins.cursospring.models.Categoria;
import com.martins.cursospring.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
 
	@Autowired
	private CategoriaService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
    		Categoria obj = service.buscar(id);	
		return ResponseEntity.ok().body(obj);
		
	}
	
	   @RequestMapping( method = RequestMethod.GET)
		public ResponseEntity<List<Categoria>> findAll(){
			
			List<Categoria> list = (List<Categoria>) service.buscarTodos();
			return ResponseEntity.ok().body(list);
			
			
		}

}
