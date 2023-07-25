package com.gabriel.loja.infrastructure.repositories;

import com.gabriel.loja.infrastructure.entities.VendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Vendarepository extends JpaRepository<VendaEntity,Long> {
}
