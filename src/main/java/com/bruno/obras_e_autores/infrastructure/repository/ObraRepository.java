package com.bruno.obras_e_autores.infrastructure.repository;

import com.bruno.obras_e_autores.infrastructure.entities.ObraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObraRepository extends JpaRepository<ObraEntity, Long> {
}
