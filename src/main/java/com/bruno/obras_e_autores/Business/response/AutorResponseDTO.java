package com.bruno.obras_e_autores.Business.response;

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
    private String sexo;
    private String email;
    private LocalDate dataNascimento;
    private String paisOrigem;
    private String cpf;
}
