package com.example.primeiroSpring.Controller;

import com.example.primeiroSpring.Model.ProdutoDTO;
import com.example.primeiroSpring.Model.ProdutoEntidade;
import com.example.primeiroSpring.Servico.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// DEVEMOS SEMPRE ANOTAR OQ A CLASSE É
@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

private ProdutoService produtoService;

@GetMapping
@ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntidade> findAll(){
    return produtoService.findAll();
}

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public ProdutoEntidade post (@RequestBody ProdutoDTO produtoDTO){
    return produtoService.post(produtoDTO);
}


}
