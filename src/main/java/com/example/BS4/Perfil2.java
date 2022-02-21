package com.example.BS4;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("other")
public class Perfil2 implements Perfiles {

    private String perfil= "perfil2";

    @Override
    public void miFuncion() {
        System.out.println("Este es el "+ perfil);
    }
}
