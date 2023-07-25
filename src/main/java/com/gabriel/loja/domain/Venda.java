package com.gabriel.loja.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Venda {
    private Long id;
    private Cliente cliente;
    private List<Produto> produtos;
    private BigDecimal valorTotal;
    private Double desconto;
    private BigDecimal valorFinal;
}
