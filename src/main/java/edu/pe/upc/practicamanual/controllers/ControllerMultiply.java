package edu.pe.upc.practicamanual.controllers;

import edu.pe.upc.practicamanual.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMultiply {

    @Autowired
    private Calculator calculator;

    public ControllerMultiply() {
        System.out.println("Creando Controlador Multiply");
    }

    @GetMapping("/multiplicar")
    public String multiplicar() {
        int a = 5;
        int b = 10;

        return "La multiplicacion de los numeros: " + a + " y " + b + " es: " + calculator.multiply(a, b);
    }
}
