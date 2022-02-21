package com.example.BS4;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class Perfil1 implements Perfiles {

    private String perfil= "perfil1";

    @Override
    public void miFuncion() {
         System.out.println("Este es el "+ perfil);
    }
}
