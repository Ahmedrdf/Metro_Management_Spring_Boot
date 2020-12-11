package ds.api.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ds.api.model.Information;
import ds.api.model.Metro;
import ds.api.repository.ActivityRepository;
import ds.api.repository.MetroRepository;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class InformationController {
	
	
	private List<String> tasks1 = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
	@Autowired
	ActivityRepository ar;
	@Autowired
/*	Arbitre_Interface aserv;
	@Autowired
	MatchesRepository mr;*/

	@GetMapping("/testee")
	// @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	List<String> findinfos() {
		return tasks1;
	}
	@GetMapping("/info")
	public List<Information> getAllinformation() {
		List<Information> arb =ar.findAll();
		return arb;
	}
	@GetMapping("/info/{id}")
	public Information getArbitre(@PathVariable(value = "id") int id ) {
		Information arb =ar.findById(id);
		return arb;
	}
	@PostMapping("/addinfo")
	// @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public Information createInfo(@Valid @RequestBody Information mr) {
		return ar.save(mr);
	}
	
	

}
