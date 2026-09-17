package com.example.primeiroSpring.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProdutoEntidade {
    private String nome;
    private double preco;
    private Integer id;
    private int qtd;


    public ProdutoEntidade(String nome, double preco, int qtd) {
    }

    public Integer getId() {
        return id;
    }
}
