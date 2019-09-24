package br.com.diadefeira.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.diadefeira.domain.Feira;
import br.com.diadefeira.domain.Feirante;
import br.com.diadefeira.repository.FeiraRepository;
import br.com.diadefeira.repository.FeiranteRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private FeiranteRepository feiranteRepo;
	
	@Autowired
	private FeiraRepository feiraRepo;

	@Override
	public void run(String... args) throws Exception {
		
		feiraRepo.deleteAll();
		feiranteRepo.deleteAll();
		
		Feirante f1 = new Feirante(null, "João", "Banca do João", "Hortfrut");
		Feirante f2 = new Feirante(null, "Maria", "Banca da Maria", "Frutas");
		Feirante f3 = new Feirante(null, "Ana", "Ana da Banana", "Frutas");
		Feirante f4 = new Feirante(null, "Italo", "Banca do Italo", "Peixaria");
		Feirante f5 = new Feirante(null, "Isabella", "Banca Bella", "Hortfrut");
		Feirante f6 = new Feirante(null, "Rachel", "Pastel da Rachel", "Salgados");
		Feirante f7 = new Feirante(null, "Zé", "Zé das Couves", "Hortfrut");
		
		feiranteRepo.saveAll(Arrays.asList(f1, f2, f3, f4, f5, f6, f7));
		
		Feira feira1 = new Feira(null, "Feirinha da DGA", "123123", "3423232");
		Feira feira2 = new Feira(null, "Feirinha da Unicamp", "343434", "566754");
		Feira feira3 = new Feira(null, "Feirinha do HC", "56454", "43545");
		
		feira1.getFeirantes().addAll(Arrays.asList(f1, f2, f3, f4));	
		feira2.getFeirantes().addAll(Arrays.asList(f3, f4, f5, f6));
		feira3.getFeirantes().addAll(Arrays.asList(f7));
		
		
		feiraRepo.saveAll(Arrays.asList(feira1, feira2, feira3));		
		
		
		
	}

}
