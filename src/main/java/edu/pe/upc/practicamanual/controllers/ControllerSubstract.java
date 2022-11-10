package edu.pe.upc.practicamanual.controllers;

import edu.pe.upc.practicamanual.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSubstract {

    @Autowired
    private Calculator calculator;

    public ControllerSubstract(){
        System.out.println("Creando Controlador Substract");
    }

    @GetMapping("/restar")
    public String restar() {
        int a = 5;
        int b = 10;

        return "La resta de los numeros: " + a + " y " + b + " es: " + calculator.substract(a, b);
    }
}