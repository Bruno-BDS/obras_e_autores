package com.bruno.obras_e_autores.business.dto.response;

import com.bruno.obras_e_autores.infrastructure.enums.SexoAutor;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutorResponseDTO {

    private Long id;
    private String nome;
    private SexoAutor sexo;
    private String email;
    private LocalDate dataNascimento;
    private String paisOrigem;
    private String cpf;
}
