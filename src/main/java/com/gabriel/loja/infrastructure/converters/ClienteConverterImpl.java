package com.gabriel.loja.infrastructure.converters;

import com.gabriel.loja.domain.Cliente;
import com.gabriel.loja.infrastructure.entities.ClienteEntity;

public class ClienteConverterImpl implements  Converter<ClienteEntity, Cliente>{
    @Override
    public ClienteEntity toEntity(Cliente domain) {
        return ClienteEntity.builder()
                .id(domain.getId())
                .cpf(domain.getCpf())
                .nome(domain.getNome())
                .endereco(domain.getEndereco())
                .build();
    }

    @Override
    public Cliente toDomain(ClienteEntity entity) {
        return Cliente.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .cpf(entity.getCpf())
                .endereco(entity.getEndereco())
                .build();
    }
}
