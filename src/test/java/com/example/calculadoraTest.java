package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class calculadoraTest {

    @Test
    void esperaQueASomaDe1Mais2Seja3() {
        int a = 1;
        int b = 2;

        calculadora calc = new calculadora();
        int soma = calc.somar(a, b);

        assertEquals(3, soma);
    }
}
