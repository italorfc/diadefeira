package br.com.diadefeira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diadefeira.domain.Feira;
import br.com.diadefeira.repository.FeiraRepository;

@Service
public class FeiraService {
	
	@Autowired
	private FeiraRepository repo;
	
	public List<Feira> findAll(){
		return repo.findAll();
	}

}
