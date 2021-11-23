package plane.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import plane.model.Plane;

@Repository
public interface PlaneRepository extends CrudRepository<Plane, Integer> {
}
