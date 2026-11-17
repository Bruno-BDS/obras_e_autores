package com.bruno.obras_e_autores.business.converter;

import com.bruno.obras_e_autores.business.dto.request.AutorRequestDTO;
import com.bruno.obras_e_autores.business.dto.response.AutorResponseDTO;
import com.bruno.obras_e_autores.infrastructure.entities.AutorEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AutorConverter {

    public AutorEntity paraEntity(AutorRequestDTO dto) {
        return AutorEntity.builder()
                .nome(dto.getNome())
                .sexo(dto.getSexo())
                .email(dto.getEmail())
                .paisOrigem(dto.getPaisOrigem())
                .dataNascimento(dto.getDataNascimento())
                .cpf(dto.getCpf())
                .build();
    }

    public AutorResponseDTO paraAutorResponseDTO(AutorEntity entity) {
        return AutorResponseDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .sexo(entity.getSexo())
                .email(entity.getEmail())
                .dataNascimento(entity.getDataNascimento())
                .paisOrigem(entity.getPaisOrigem())
                .cpf(entity.getCpf())
                .build();
    }
}
