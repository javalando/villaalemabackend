package br.com.villaalema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.villaalema.domain.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Integer> {


	
	
}
