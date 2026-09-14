package com.example.primeiroSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//O CONTROLER RECEBE A REQUISIÇÃO E PASSA PARA A CLASSE SERVECE PARA PROCESSAR

@RestController // PARA INDICAR QUE ESTA CLASSE É UM CONTROLER
@RequestMapping("/hello-world") // PARA INDICAR QUAIS PATHS O CONTROLLER IRA RECEBEBER AS REQUISIÇÕES COM O END-POINT /hello-world
public class HelloController {

/*
PARA OS METODOS DA CLASSE
SEMPRE DEVEMOS INDICAR QUAL METODO HTTP ELE RESPONDE
HTTP - POST, PUT, GET, DELETE
 */

    /*
    METODO DA CLASSE
    ESTE METODO  RESPONDE AO METODO GET NO END-POINT /hello-world
   NA URL ->  /GET/hello-world
    */
    @GetMapping // ESTE METODO RESPONDE AO METODO GET DO HTTP
    public String hello(){
        return "Hey, guys 👋!";
    }

}
