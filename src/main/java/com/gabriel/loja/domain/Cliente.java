package com.gabriel.loja.domain;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    private Long id;
    private String nome;
    private String endereco;
    private String cpf;
}
