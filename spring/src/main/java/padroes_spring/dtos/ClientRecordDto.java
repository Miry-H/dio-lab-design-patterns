package padroes_spring.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClientRecordDto (@NotBlank @NotNull String nome, @NotBlank @NotNull String cep){

}
