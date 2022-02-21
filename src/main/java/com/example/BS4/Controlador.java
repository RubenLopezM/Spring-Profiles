package com.example.BS4;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class Controlador {

    @Value("${VAR1}")
    public String VAR1;

    @Value("${My.VAR2}")
    public int VAR2;

    @Value("${VAR3}")
    private String valor;

    @Value("${url}")
    private String url;

    @Value("${password}")
    private String password;

    @Autowired
    private Properties properties;

    @Autowired
    private Perfiles perfiles;


    @GetMapping("valores")
   public String getProperties(){
       return ("El valor de var1 es: "+ VAR1 + " El valor de var2 es:"+ VAR2);
    }

    @GetMapping("var3")
    public String getVar3(){
        return ("El valor de var3 es: " + valor);
    }

    @GetMapping("parametros")
    public String getParams(){
        return ("La url es "+ url + "y la contraseña es: " + password);
    }



    @GetMapping("miconfiguracion")
    public String getMyProperties(){

        return properties.toString();
    }

    @GetMapping("perfil")
    public void getProfile(){

         perfiles.miFuncion();
    }
}
