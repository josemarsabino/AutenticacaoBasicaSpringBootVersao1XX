package br.com.sada.springsecuritybasico.resources;

import java.net.URI;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.sada.springsecuritybasico.model.Categoria;
import br.com.sada.springsecuritybasico.repository.CategoriaRepository;
import br.com.sada.springsecuritybasico.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	/*
	 * @RequestMapping(method = RequestMethod.GET) public String
	 * testeRestCategoria() { return "Rest Categoria Ok"; }
	 */
	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listarTodos() {
		return categoriaRepository.findAll();
	}


	// Gravando categoria
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria categoria, HttpServletResponse response) {
		Categoria categoriaSalva = categoriaService.gravarCategoria(categoria);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(categoriaSalva.getCodigo()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(categoriaSalva);

	}

	// Consultando Produto
	@RequestMapping(value = "/{codCategoria}", method = RequestMethod.GET)
	public Categoria buscarPeloCodigo(@PathVariable Long codCategoria) {
		return categoriaService.listarPorId(codCategoria);
	}


	// Alterando Categoria FUNCIONANDO OK
	@RequestMapping(method = RequestMethod.PUT)
	public Categoria updateCategoria(@RequestBody Categoria categoria) {
		return categoriaService.alterarCategoria(categoria);

	}

}
