package br.com.diadefeira.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.diadefeira.domain.Feira;

public interface FeiraRepository extends MongoRepository<Feira, String> {
	

}
