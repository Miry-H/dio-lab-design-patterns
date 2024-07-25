package padroes_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import padroes_spring.models.AddressModel;

@Repository
public interface AddressRepository extends JpaRepository<AddressModel, String>{

}
