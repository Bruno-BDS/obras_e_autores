package com.bruno.obras_e_autores.business.converter;

import com.bruno.obras_e_autores.business.dto.request.ObraRequestDTO;
import com.bruno.obras_e_autores.business.dto.response.ObraResponseDTO;
import com.bruno.obras_e_autores.infrastructure.entities.ObraEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class ObraConverter {

    private final AutorConverter autorConverter;

    public ObraEntity paraObraEntity(ObraRequestDTO dto){
        return ObraEntity.builder()
                .nome(dto.getNome())
                .descricao(dto.getDescricao())
                .dataPublicacao(dto.getDataDePublicacao())
                .dataExposicao(dto.getDataDeExposicao())
                .build();
    }

    public ObraResponseDTO paraObraResponseDTO(ObraEntity entity){
        return ObraResponseDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .descricao(entity.getDescricao())
                .dataPublicacao(entity.getDataPublicacao())
                .dataExposicao(entity.getDataExposicao())
                .autores(entity.getAutores()
                        .stream()
                        .map(autorConverter::paraAutorResponseDTO)
                        .collect(Collectors.toSet()))
                .build();
    }
}
