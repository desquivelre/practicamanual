package edu.pe.upc.practicamanual.services;

import org.springframework.beans.factory.annotation.Autowired;

public class Calculator {

    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public int substract(int numberA, int numberB) {
        return numberA - numberB;
    }

    public int multiply (int numberA, int numberB) {
        return numberA * numberB;
    }

    public int divide(int numberA, int numberB) {
        return numberA / numberB;
    }
}
