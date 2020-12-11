package ds.api.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ds.api.exception.ResourceNotFoundException;
import ds.api.model.Metro;
import ds.api.repository.MetroRepository;



@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class MetroController {
	private List<String> tasks1 = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
	@Autowired
	MetroRepository ar;
	@Autowired
/*	Arbitre_Interface aserv;
	@Autowired
	MatchesRepository mr;*/

	@GetMapping("/test")
	// @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	List<String> findAllarb() {
		return tasks1;
	}
	@GetMapping("/metro")
	public List<Metro> getAllArbitre() {
		List<Metro> arb =ar.findAll();
		return arb;
	}
	@GetMapping("/metro/{id}")
	public Metro getArbitre(@PathVariable(value = "id") int id ) {
		Metro arb =ar.findById(id);
		return arb;
	}
	@PostMapping("/addmetro")
	// @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public Metro createProject(@Valid @RequestBody Metro mr) {
		return ar.save(mr);
	}
	
	
	
	@PutMapping("metro/update/{id}")
	public ResponseEntity<Metro> updateEmployee(@PathVariable(value = "id") int arbitreId,
			@Valid @RequestBody Metro arbitredetails) throws ResourceNotFoundException {
		Metro arbitre = ar.findById(arbitreId);		
		arbitre.setId(arbitredetails.getId());
		arbitre.setName(arbitredetails.getName());
		arbitre.setDatedepart(arbitredetails.getHeuredept());
		arbitre.setDatearrive(arbitredetails.getDatearrive());
		arbitre.setHeuredept(arbitredetails.getHeuredept());
		arbitre.setHeurearrive(arbitredetails.getHeurearrive());
		arbitre.setCapacite(arbitredetails.getCapacite());
		arbitre.setEtat(arbitredetails.getEtat());
		final Metro updatearbitre = ar.save(arbitre);
		return ResponseEntity.ok(updatearbitre);
	}

	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteMetro(@PathVariable(value = "id") int arbitreId)
			throws ResourceNotFoundException {
		Metro arbitre = ar.findById(arbitreId);
		ar.delete(arbitre);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
	
	
	
