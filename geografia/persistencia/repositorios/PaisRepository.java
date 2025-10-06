package com.asys.geografia.persistencia.repositorios;

import com.asys.geografia.persistencia.entidades.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<PaisEntity, Long> {
}
