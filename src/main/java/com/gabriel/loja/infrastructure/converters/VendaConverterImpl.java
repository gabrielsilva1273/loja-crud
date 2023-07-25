package com.gabriel.loja.infrastructure.converters;

import com.gabriel.loja.domain.Venda;
import com.gabriel.loja.infrastructure.entities.VendaEntity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VendaConverterImpl implements Converter<VendaEntity, Venda> {

    private final ClienteConverterImpl clienteConverter;
    private final ProdutoConverterImpl produtoConverter;
    @Override
    public VendaEntity toEntity(Venda domain) {
        return VendaEntity.builder()
                .id(domain.getId())
                .cliente(clienteConverter.toEntity(domain.getCliente()))
                .produtos(produtoConverter.toEntities(domain.getProdutos()))
                .desconto(domain.getDesconto())
                .valorTotal(domain.getValorTotal())
                .valorFinal(domain.getValorFinal())
                .build();
    }

    @Override
    public Venda toDomain(VendaEntity entity) {
        return Venda.builder()
                .id(entity.getId())
                .cliente(clienteConverter.toDomain(entity.getCliente()))
                .produtos(produtoConverter.toDomains(entity.getProdutos()))
                .desconto(entity.getDesconto())
                .valorTotal(entity.getValorTotal())
                .valorFinal(entity.getValorFinal())
                .build();
    }
}
