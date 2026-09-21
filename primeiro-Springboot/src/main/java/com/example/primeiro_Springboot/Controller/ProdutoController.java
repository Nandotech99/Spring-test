package com.example.primeiro_Springboot.Controller;

import com.example.primeiro_Springboot.DTO.ProdutoDTO;
import com.example.primeiro_Springboot.Model.ProdutoEntidade;
import com.example.primeiro_Springboot.Servico.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// O CONTROLLER É O INETERMEDIARIO ENTRE A VIEW E A MODEL
// RECEBE  AS REQUISIÇÕES E CHAMA OS METODOS DO SERVICE PARA REALIZAR AS OPERAÇÕES
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

@PutMapping("/{id}") // CAMINHO ESPERANDO UMA ID Q EXISTE NA LISTA
@ResponseStatus(HttpStatus.CREATED)
public ProdutoEntidade put(@PathVariable int id, @RequestBody ProdutoDTO produtoDTO){
    return  produtoService.put(produtoDTO,id);
}
@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.CREATED)
public void delete(@PathVariable int id){
    produtoService.delete(id);
}

}
=======
package com.example.primeiro_Springboot.Controller;

import com.example.primeiro_Springboot.DTO.ProdutoDTO;
import com.example.primeiro_Springboot.Model.ProdutoEntidade;
import com.example.primeiro_Springboot.Servico.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// O CONTROLLER É O INETERMEDIARIO ENTRE A VIEW E A MODEL
// RECEBE  AS REQUISIÇÕES E CHAMA OS METODOS DO SERVICE PARA REALIZAR AS OPERAÇÕES
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

@PutMapping("/{id}") // CAMINHO ESPERANDO UMA ID Q EXISTE NA LISTA
@ResponseStatus(HttpStatus.CREATED)
public ProdutoEntidade put(@PathVariable int id, @RequestBody ProdutoDTO produtoDTO){
    return  produtoService.put(produtoDTO,id);
}
@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.CREATED)
public void delete(@PathVariable int id){
    produtoService.delete(id);
}

}
