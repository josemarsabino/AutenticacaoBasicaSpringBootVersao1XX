package br.com.sada.springsecuritybasico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sada.springsecuritybasico.model.Categoria;
import br.com.sada.springsecuritybasico.model.Pessoa;
import br.com.sada.springsecuritybasico.repository.CategoriaRepository;
import br.com.sada.springsecuritybasico.repository.PessoasRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoasRepository pessoaRepository;

	// Listando todas Categorias
	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

}
