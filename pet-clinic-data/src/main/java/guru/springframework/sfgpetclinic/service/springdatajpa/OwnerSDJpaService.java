package guru.springframework.sfgpetclinic.service.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repository.OwnerRepository;
import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.PetService;
import guru.springframework.sfgpetclinic.service.PetTypeService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by thamhv on 10/21/2019.
 */
@Profile("springdatajpa")
@Service
@AllArgsConstructor
public class OwnerSDJpaService  implements OwnerService {

    private PetService petService;
    private PetTypeService petTypeService;
    private final OwnerRepository ownerRepository;


    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerRepository.findAll().forEach(ownerSet::add);
        return ownerSet;
    }

    @Override
    public Owner findById(Long id) {

        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);

    }
}
