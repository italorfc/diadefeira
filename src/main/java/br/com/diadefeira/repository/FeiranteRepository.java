package br.com.diadefeira.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.diadefeira.domain.Feirante;

public interface FeiranteRepository extends MongoRepository<Feirante, String>{

}
