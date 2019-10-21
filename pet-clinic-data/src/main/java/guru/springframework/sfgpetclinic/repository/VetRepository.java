package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thamhv on 10/21/2019.
 */

public interface VetRepository extends CrudRepository<Vet,Long> {
}
