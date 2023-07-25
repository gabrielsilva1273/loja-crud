package com.gabriel.loja.infrastructure.repositories;

import com.gabriel.loja.infrastructure.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity,Long> {
}
