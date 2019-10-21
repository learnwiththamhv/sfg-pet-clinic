package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thamhv on 10/21/2019.
 */

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
