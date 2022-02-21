package com.example.BS4;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("miconfiguracion.properties")
@ConfigurationProperties(prefix = "simple")
public class Properties {
    private int valor1;
    private int valor2;


    public void setValor1(int valor1){
        this.valor1=valor1;
    }

    public void setValor2(int valor2){
        this.valor2=valor2;
    }

    @Override
    public String toString() {
        return "Properties{ " +
                "valor1= " + valor1 +
                ", valor2= " + valor2 +
                '}';
    }
}

