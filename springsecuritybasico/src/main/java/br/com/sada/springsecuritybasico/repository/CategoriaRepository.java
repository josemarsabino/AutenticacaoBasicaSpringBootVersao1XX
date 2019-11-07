package br.com.sada.springsecuritybasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.springsecuritybasico.model.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{

}
