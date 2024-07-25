package padroes_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import padroes_spring.models.ClientModel;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long>{

}
