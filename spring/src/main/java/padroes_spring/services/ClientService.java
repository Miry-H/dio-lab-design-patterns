package padroes_spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import padroes_spring.dtos.ClientRecordDto;
import padroes_spring.models.AddressModel;
import padroes_spring.models.ClientModel;
import padroes_spring.repositories.AddressRepository;
import padroes_spring.repositories.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    public List<ClientModel> getAllClients() {
        return clientRepository.findAll();
    }

    public Optional<ClientModel> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public ClientModel saveClient(ClientRecordDto clientDto) {
        // Consome a API ViaCEP para obter o endereço
    	String cep = clientDto.cep();
        AddressModel address = addressRepository.findById(cep).orElseGet(() -> {
			// Caso não exista, integrar com o ViaCEP e persistir o retorno.
			AddressModel newAddress = viaCepService.consultarCep(cep);
			addressRepository.save(newAddress);
			return newAddress;
		});

        // Cria e salva o modelo do cliente
        ClientModel clientModel = new ClientModel();
        BeanUtils.copyProperties(clientDto, clientModel);
        clientModel.setEndereco(address);
        return clientRepository.save(clientModel);
    }

    public Optional<ClientModel> updateClient(Long id, ClientRecordDto clientDto) {
        Optional<ClientModel> clientO = clientRepository.findById(id);
        if (clientO.isPresent()) {
            ClientModel clientModel = clientO.get();
            BeanUtils.copyProperties(clientDto, clientModel);
            
        	String cep = clientDto.cep();
            AddressModel address = addressRepository.findById(cep).orElseGet(() -> {
    			// Caso não exista, integrar com o ViaCEP e persistir o retorno.
    			AddressModel newAddress = viaCepService.consultarCep(cep);
    			addressRepository.save(newAddress);
    			return newAddress;
    		});
            
            clientModel.setEndereco(address);
            return Optional.of(clientRepository.save(clientModel));
        }
        return Optional.empty();
    }

    public boolean deleteClient(Long id) {
        Optional<ClientModel> clientO = clientRepository.findById(id);
        if (clientO.isPresent()) {
            clientRepository.delete(clientO.get());
            return true;
        }
        return false;
    }
}

