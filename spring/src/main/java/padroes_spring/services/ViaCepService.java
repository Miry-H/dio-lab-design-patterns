package padroes_spring.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import padroes_spring.models.AddressModel;

/**
 * Client HTTP, criado com OpenFeign, para o consumo da API do ViaCEP
 * 
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	AddressModel consultarCep(@PathVariable("cep") String cep);
}
