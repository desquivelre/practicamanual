package edu.pe.upc.practicamanual.controllers;

import edu.pe.upc.practicamanual.config.ApplicationConfig;
import edu.pe.upc.practicamanual.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAdd {

    @Autowired
    private Calculator calculator;

    public ControllerAdd(){
        System.out.println("Creando Controlador Add");
    }

    @GetMapping("/sumar")
    public String sumar() {
        int a = 5;
        int b = 10;

        return "La suma de los numeros: " + a + " y " + b + " es: " + calculator.add(a, b);
    }
}
