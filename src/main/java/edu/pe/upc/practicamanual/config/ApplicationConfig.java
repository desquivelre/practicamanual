package edu.pe.upc.practicamanual.config;

import edu.pe.upc.practicamanual.services.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Calculator configCalculator (){
        System.out.println("Creando bean Calculator");
        return new Calculator();
    }
}
