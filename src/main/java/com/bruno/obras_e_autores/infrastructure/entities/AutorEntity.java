package com.bruno.obras_e_autores.infrastructure.entities;

import com.bruno.obras_e_autores.infrastructure.enums.SexoAutor;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Autor")
public class AutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "Sexo_do_Autor")
    private SexoAutor sexoAutor;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "pais_origem", nullable = false)
    private String paisOrigem;

    @Column(unique = true)
    private String cpf;

    @ManyToMany(mappedBy = "autores")
    @Builder.Default
    private Set<ObraEntity> obras = new HashSet<>();
}
