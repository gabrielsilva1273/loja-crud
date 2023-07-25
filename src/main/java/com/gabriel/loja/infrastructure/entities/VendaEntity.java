package com.gabriel.loja.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "venda")
public class VendaEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id",nullable = false)
    private ClienteEntity cliente;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<ProdutoEntity> produtos;

    private BigDecimal valorTotal;
    private Double desconto;
    private BigDecimal valorFinal;
}
