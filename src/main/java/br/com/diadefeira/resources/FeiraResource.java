package br.com.diadefeira.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.diadefeira.domain.Feira;
import br.com.diadefeira.services.FeiraService;

@RestController
@RequestMapping(value="/feiras")
public class FeiraResource {
	
	@Autowired
	private FeiraService feiraService;
	
	@GetMapping
	public ResponseEntity<List<Feira>> findAll(){
		List<Feira> list = feiraService.findAll();
		return ResponseEntity.ok().body(list);
	}

}
