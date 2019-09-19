package br.com.diadefeira.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.diadefeira.domain.Feira;
import br.com.diadefeira.repository.FeiraRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private FeiraRepository feiraRepo;

	@Override
	public void run(String... args) throws Exception {
		
		feiraRepo.deleteAll();
		
		Feira f1 = new Feira(null, "Feirinha da DGA", "123123", "3423232");
		Feira f2 = new Feira(null, "Feirinha da Unicamo", "343434", "566754");
		Feira f3 = new Feira(null, "Feirinha do HC", "56454", "43545");
		
		feiraRepo.saveAll(Arrays.asList(f1, f2, f3));		
		
	}

}
