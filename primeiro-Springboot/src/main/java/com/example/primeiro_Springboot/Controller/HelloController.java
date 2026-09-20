package com.example.primeiro_Springboot.Controller;

import com.example.primeiro_Springboot.Servico.HelloWorldService;
import org.springframework.web.bind.annotation.*;


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

   @GetMapping ("/{nome}")
    public String get1(@PathVariable String nome){
        return "Eae, "+ nome+"! Tranquilo!?";
   }

   @GetMapping("/get")
    public String get2(@RequestParam (required= false) String nome){
        return "Eae, de boa "+nome+"! 😊";
   }






}
