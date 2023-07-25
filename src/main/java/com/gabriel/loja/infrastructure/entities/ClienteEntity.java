package com.gabriel.loja.infrastructure.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@Entity
@AllArgsConstructor
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String endereco;
    private String cpf;
}
