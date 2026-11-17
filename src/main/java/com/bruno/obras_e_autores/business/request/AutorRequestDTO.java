package com.bruno.obras_e_autores.business.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutorRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    private String sexo;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Informe um email válido")
    private String email;

    @Past(message = "A data de nascimento deve ser anterior à data atual")
    private LocalDate dataNascimento;

    @NotBlank(message = "O pais de origem é obrigatório")
    private String paisOrigem;

    private String cpf;
}
