package br.com.villaalema.rs;

import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	//TODO ajustar
	@PostMapping(value = "/salvar")
	public ResponseEntity<Mesa> cadastrar(Mesa mesa) throws NoSuchAlgorithmException {

		Mesa mesax = servico.salvar(mesa);
		log.info("chegou");
		
		return ResponseEntity.ok(mesax);
		
	}
	
	@GetMapping(value = "/id/{id}")
	public  ResponseEntity<Mesa> buscarPorId(@PathVariable("id") Integer id) {
		
		Mesa mesa = servico.buscar(id);
	
		return ResponseEntity.ok(mesa) ;
	
	}
	
}	
