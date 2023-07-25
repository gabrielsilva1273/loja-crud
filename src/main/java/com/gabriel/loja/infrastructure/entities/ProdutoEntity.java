package com.gabriel.loja.infrastructure.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    private Long id;
    private String nome;
    private BigDecimal valor;
    private Integer quantidade;
}
