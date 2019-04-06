package br.com.villaalema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.villaalema.domain.Mesa;
import br.com.villaalema.repository.MesaRepository;

@Service
public class MesaService {

	@Autowired
	private MesaRepository repo;
	
	public Mesa buscar(Integer id) {
		Optional<Mesa> mesa = repo.findById(id);
		
		return mesa.orElse(null);
	}
	
	public List<Mesa> buscarAll() {
		List<Mesa> mesas = repo.findAll();
		
		return mesas;
	}
	
	
}
