package com.example.primeiro_Springboot.Servico;

import com.example.primeiro_Springboot.DTO.ProdutoDTO;
import com.example.primeiro_Springboot.Model.ProdutoEntidade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

// DEVEMOS SEMPRE ANOTAR OQ A CLASSE É
@Service
public class ProdutoService {
   List<ProdutoEntidade> produto = new ArrayList<>();
   // metodo para retornar os produtos
   public List<ProdutoEntidade> getAll (){
       return new ArrayList<>(produto);
   }

   public ProdutoEntidade post (ProdutoDTO produtoDTO){

       int id =produto.stream().mapToInt(ProdutoEntidade::getId).max().orElse(0)+1;

       ProdutoEntidade novoProduto= new ProdutoEntidade(produtoDTO.getNome(),produtoDTO.getPreco(),id,produtoDTO.getQtd());
       produto.add(novoProduto);
       return novoProduto;
   }


}
