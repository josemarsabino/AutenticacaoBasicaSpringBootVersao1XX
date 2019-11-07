package br.com.sada.springsecuritybasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sada.springsecuritybasico.model.Pessoa;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoa, Long> {

}
