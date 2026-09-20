package com.example.primeiro_Springboot.Controller;

import com.example.primeiro_Springboot.DTO.ProdutoDTO;
import com.example.primeiro_Springboot.Model.ProdutoEntidade;
import com.example.primeiro_Springboot.Servico.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// DEVEMOS SEMPRE ANOTAR OQ A CLASSE É
@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

private final ProdutoService produtoService;

@GetMapping
@ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntidade> getAll(){
    return produtoService.getAll();
}

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public ProdutoEntidade post (@RequestBody ProdutoDTO produtoDTO){
    return produtoService.post(produtoDTO);
}


}
