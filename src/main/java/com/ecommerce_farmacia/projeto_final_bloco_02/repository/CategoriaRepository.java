package com.ecommerce_farmacia.projeto_final_bloco_02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_farmacia.projeto_final_bloco_02.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
