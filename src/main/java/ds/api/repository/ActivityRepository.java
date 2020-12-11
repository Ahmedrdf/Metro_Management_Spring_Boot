package ds.api.repository;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import ds.api.model.Information;
public interface ActivityRepository extends CrudRepository<Information, Long> {
	
List<Information> findAll();
Information findById(int id);

}
