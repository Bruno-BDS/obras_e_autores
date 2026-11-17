package com.bruno.obras_e_autores.infrastructure.repository;

import com.bruno.obras_e_autores.infrastructure.entities.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AutorRepository  extends JpaRepository<AutorEntity, Long> {

    Optional<AutorEntity> findByCpf(String cpf);
    Optional<AutorEntity> findByEmail(String email);

    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
}
