package br.com.sada.springsecuritybasico.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sada.springsecuritybasico.model.Categoria;
import br.com.sada.springsecuritybasico.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	// Listando todas Categorias
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	// Listar por ID
	public Categoria listarPorId(Long codCategoria) {
		return categoriaRepository.findOne(codCategoria);
	
	}

	// Gravando Categoria
	public Categoria gravarCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	// Deletando Categoria
	public void apagarCategoriaId(Long idCategoria) {
		categoriaRepository.delete(idCategoria);
		
	}

	// Alterando Categoria
	public Categoria alterarCategoria(Categoria categoria) {
		System.out.println("Categoria que chegou no Service" + " " + categoria);

		Categoria novaCategoria = new Categoria();
		// Setando Valores
		novaCategoria.setCodigo(categoria.getCodigo());
		novaCategoria.setNome(categoria.getNome());
		System.out.println("Nova Categoria Montada" + " " + novaCategoria);
		return categoriaRepository.save(novaCategoria);
	}


}
