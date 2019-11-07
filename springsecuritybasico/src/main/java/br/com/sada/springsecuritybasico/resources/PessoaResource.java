package br.com.sada.springsecuritybasico.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.springsecuritybasico.model.Categoria;
import br.com.sada.springsecuritybasico.model.Pessoa;

import br.com.sada.springsecuritybasico.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
	@Autowired
	PessoaService pessoaService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Pessoa> listarTodos() {
		return pessoaService.findAll();
	}

}
