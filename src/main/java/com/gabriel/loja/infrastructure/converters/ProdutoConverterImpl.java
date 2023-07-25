package com.gabriel.loja.infrastructure.converters;

import com.gabriel.loja.domain.Produto;
import com.gabriel.loja.infrastructure.entities.ProdutoEntity;

public class ProdutoConverterImpl implements Converter<ProdutoEntity, Produto>{
    @Override
    public ProdutoEntity toEntity(Produto domain) {
        return ProdutoEntity.builder()
                .id(domain.getId())
                .nome(domain.getNome())
                .valor(domain.getValor())
                .quantidade(domain.getQuantidade())
                .build();
    }

    @Override
    public Produto toDomain(ProdutoEntity entity) {

        return Produto.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .valor(entity.getValor())
                .quantidade(entity.getQuantidade())
                .build();
    }
}
