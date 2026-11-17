package com.bruno.obras_e_autores.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "obra")
public class ObraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(length = 240)
    private String descricao;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @Column(name = "data_exposicao")
    private LocalDate dataExposicao;

    @ManyToMany
    @JoinTable(
            name = "autor_obra",
            joinColumns = @JoinColumn(name = "obra_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    @Builder.Default
    private Set<AutorEntity> autores = new HashSet<>();
}
