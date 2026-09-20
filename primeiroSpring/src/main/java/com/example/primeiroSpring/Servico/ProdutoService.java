package com.example.primeiroSpring.Servico;

import com.example.primeiroSpring.Model.ProdutoDTO;
import com.example.primeiroSpring.Model.ProdutoEntidade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

// DEVEMOS SEMPRE ANOTAR OQ A CLASSE É
@Service
public class ProdutoService {
   List<ProdutoEntidade> produto = new ArrayList<>();
   // metodo para retornar os produtos
   public List<ProdutoEntidade> findAll (){
       return new ArrayList<>(produto);
   }

   public ProdutoEntidade post (ProdutoDTO produtoDTO){

       int id =produto.stream().mapToInt(ProdutoEntidade::getId).max().orElse(0)+1;


       ProdutoEntidade novoProduto= new ProdutoEntidade(produtoDTO.getNome(),produtoDTO.getPreco(),produtoDTO.getQtd());
       produto.add(novoProduto);
       return novoProduto;
   }


}
