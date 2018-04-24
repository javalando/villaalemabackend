package br.com.villaalema.api.controller;

import java.security.NoSuchAlgorithmException;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.villaalema.api.dto.ProdutoDTO;
import br.com.villaalema.api.response.Response;

@RestController
@RequestMapping("/api/produto")
@CrossOrigin(origins = "*")
public class ProdutoController {

	private static final Logger log = LoggerFactory.getLogger(ProdutoController.class);
	
	public ProdutoController() {
	}
	
	@PostMapping
	public ResponseEntity<Response<ProdutoDTO>> cadastrar(@Valid @RequestBody ProdutoDTO cadastroDto,
			BindingResult result) throws NoSuchAlgorithmException {
		
		Response<ProdutoDTO> response = new Response<ProdutoDTO>();
		
		//implementar
		log.info("chegou");
		
		return ResponseEntity.ok(response);
		
	}
	
	@GetMapping(value = "/nome/{nome}")
	public ResponseEntity<Response<ProdutoDTO>> buscarPorNome(@PathVariable("nome") String nome) {
		Response<ProdutoDTO> response = new Response<ProdutoDTO>();
		
		//implementar
		log.info("chegou");
		
		return ResponseEntity.ok(response);
	}
	
}	
