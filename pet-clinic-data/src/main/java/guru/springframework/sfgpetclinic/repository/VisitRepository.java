package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thamhv on 10/21/2019.
 */

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
