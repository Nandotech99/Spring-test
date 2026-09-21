<<<<<<< HEAD
package com.example.primeiro_Springboot.Servico;

import com.example.primeiro_Springboot.DTO.ProdutoDTO;
import com.example.primeiro_Springboot.Model.ProdutoEntidade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

// A CLASSE SERVICE É ONDE VOU GUARDAR A LOGICA DAS MINHAS REGRAS DE NEGOCIO
// È  ela que realiza as operações de fato

// DEVEMOS SEMPRE ANOTAR OQ A CLASSE É
@Service
public class ProdutoService {
   List<ProdutoEntidade> produtoS = new ArrayList<>();
   // metodo para retornar os produtos
   public List<ProdutoEntidade> getAll (){
       return new ArrayList<>(produtoS);
   }

   public ProdutoEntidade post (ProdutoDTO produtoDTO){

       int id =produtoS.stream().mapToInt(ProdutoEntidade::getId).max().orElse(0)+1;

       ProdutoEntidade novoProduto= new ProdutoEntidade(produtoDTO.getNome(),produtoDTO.getPreco(),id,produtoDTO.getQtd());
       produtoS.add(novoProduto);
       return novoProduto;
   }
   public ProdutoEntidade put(ProdutoDTO produtoDTO, int id){
  // PARA ATUALIZAR O PRODUTO PRIMEIRO DEVEMOS VERIFICAR SE ELE EXISTE NA LISTA
       for (ProdutoEntidade produto: produtoS){
        if(produto.getId()==id){
         produto.setNome(produtoDTO.getNome());
         produto.setPreco(produtoDTO.getPreco());
         produto.setQtd(produtoDTO.getQtd());
         return produto;
    }
       }
return null;
   }
   public void delete(int id){
       for (ProdutoEntidade p :produtoS){
           if(p.getId()==id){
               produtoS.remove(p);
           }
       }
   }

}
=======
package com.example.primeiro_Springboot.Servico;

import com.example.primeiro_Springboot.DTO.ProdutoDTO;
import com.example.primeiro_Springboot.Model.ProdutoEntidade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

// A CLASSE SERVICE É ONDE VOU GUARDAR A LOGICA DAS MINHAS REGRAS DE NEGOCIO

// DEVEMOS SEMPRE ANOTAR OQ A CLASSE É
@Service
public class ProdutoService {
   List<ProdutoEntidade> produtoS = new ArrayList<>();
   // metodo para retornar os produtos
   public List<ProdutoEntidade> getAll (){
       return new ArrayList<>(produtoS);
   }

   public ProdutoEntidade post (ProdutoDTO produtoDTO){

       int id =produtoS.stream().mapToInt(ProdutoEntidade::getId).max().orElse(0)+1;

       ProdutoEntidade novoProduto= new ProdutoEntidade(produtoDTO.getNome(),produtoDTO.getPreco(),id,produtoDTO.getQtd());
       produtoS.add(novoProduto);
       return novoProduto;
   }
   public ProdutoEntidade put(ProdutoDTO produtoDTO, int id){
  // PARA ATUALIZAR O PRODUTO PRIMEIRO DEVEMOS VERIFICAR SE ELE EXISTE NA LISTA
       for (ProdutoEntidade produto: produtoS){
        if(produto.getId()==id){
         produto.setNome(produtoDTO.getNome());
         produto.setPreco(produtoDTO.getPreco());
         produto.setQtd(produtoDTO.getQtd());
         return produto;
    }
       }
return null;
   }
   public void delete(int id){
       for (ProdutoEntidade p :produtoS){
           if(p.getId()==id){
               produtoS.remove(p);
           }
       }
   }

}
>>>>>>> d5cf965425b318200ad1ea44d99432cfeffc4732
