package com.example.primeiroSpring.Servico;

import org.springframework.stereotype.Service;

// ESTA CLASSE É ONDE FIACA AS LOGICAS  DA REGRA DE NEGOCIO DA APLICAÇÃO
//O CONTROLER RECEBE A REQUISIÇÃO E PASSA PARA A CLASSE SERVECE PARA PROCESSAR


@Service // INDICA QUE ESTA CLASSE É UM SERVICO
public class HelloWorldService {
    public String hello(String name){
        return "Eae, "+ name+"! Tudo bem?";
    }
}
