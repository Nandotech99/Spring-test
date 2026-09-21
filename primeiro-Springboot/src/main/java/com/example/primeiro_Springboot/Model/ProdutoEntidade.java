package com.example.primeiro_Springboot.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
// Classe criada para representar uma entidade no banco de dados
public class ProdutoEntidade {
    private String nome;
    private double preco;
    private int id;
    private int qtd;


    public ProdutoEntidade(String nome, double preco, Integer id, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
        this.qtd = qtd;
    }

    public int getId() {
        return id;
    }
}

