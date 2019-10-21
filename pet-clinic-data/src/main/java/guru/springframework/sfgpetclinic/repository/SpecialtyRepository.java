package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thamhv on 10/21/2019.
 */

public interface SpecialtyRepository extends CrudRepository<Specialty,Long> {
}
