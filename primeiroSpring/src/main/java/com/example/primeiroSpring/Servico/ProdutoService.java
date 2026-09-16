package com.example.primeiroSpring.Servico;

import com.example.primeiroSpring.Model.ProdutoEntidade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// DEVEMOS SEMPRE ANOTAR OQ A CLASSE É
@Service
public class ProdutoService {
    private static  final List<ProdutoEntidade> PRODUTO= List.of(
            .id(23)
            .nome("banana")
            .preco(5.99)
            .qdt(5)
            ProdutoEntidade.builder()
    );



}
