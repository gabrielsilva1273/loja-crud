package com.gabriel.loja.domain;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto {
    private Long id;
    private String nome;
    private BigDecimal valor;
    private Integer quantidade;
}
