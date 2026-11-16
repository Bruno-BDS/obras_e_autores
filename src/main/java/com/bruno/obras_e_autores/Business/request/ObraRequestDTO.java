package com.bruno.obras_e_autores.Business.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObraRequestDTO {

    @NotBlank(message = "O nome da obra é obrigatório")
    private String nome;
    @Size(max = 240, message = "A descrição deve ter no máximo 240 caracteres")
    private String descricao;

    private LocalDate dataDePublicacao;

    private LocalDate dataDeExposicao;

    @Valid
    private Set<AutorRequestDTO> autores;

    @AssertTrue(message = "Informe a data de publicação ou de exposição")
    public boolean dataObrigatoriaInformada() {
        return dataDeExposicao != null || dataDePublicacao != null;
    }
}
