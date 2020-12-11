package ds.api.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ds.api.model.Metro;

import org.springframework.data.domain.Pageable;

public interface MetroRepository extends CrudRepository<Metro, Long> {


	List<Metro> findAll();

Metro findById(int id);


	@Transactional
	void deleteByname(String name);

}
// Arbitre update();
