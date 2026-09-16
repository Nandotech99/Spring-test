package com.example.primeiroSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEntidade {
    private String nome;
    private double preco;
    private Integer id;
    private int qtd;
}
