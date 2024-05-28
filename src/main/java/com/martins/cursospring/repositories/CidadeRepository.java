package com.martins.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martins.cursospring.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
