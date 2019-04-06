package br.com.villaalema.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.villaalema.domain.Mesa;
import br.com.villaalema.service.MesaService;



@RestController
@RequestMapping("/api/mesa")
@CrossOrigin(origins = "*")
public class MesaAPI {

	private static final Logger log = LoggerFactory.getLogger(MesaAPI.class);
	
	@Autowired
	private MesaService servico;
	
	public MesaAPI() {
	}
	
	/*@PostMapping
	public ResponseEntity<Response<TipoMesa>> cadastrar(@Valid @RequestBody TipoMesa tipomesa,
			BindingResult result) throws NoSuchAlgorithmException {
		
		Response<TipoMesa> response = new Response<TipoMesa>();
		
		//implementar
		log.info("chegou");
		
		return ResponseEntity.ok(response);
		
	}*/
	
	@GetMapping(value = "/id/{id}")
	public Mesa buscarPorId(@PathVariable("id") Integer id) {
		
		Mesa mesa = servico.buscar(id);
		
		
		return mesa ;
	
	}
	
}	
