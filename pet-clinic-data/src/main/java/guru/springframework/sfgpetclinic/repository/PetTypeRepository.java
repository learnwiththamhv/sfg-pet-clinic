package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thamhv on 10/21/2019.
 */

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
