package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class calculadoraFalhaTest {

    @Test
    void deveFalharParaMostrarORedDoTDD() {
        calculadora calc = new calculadora();
        int resultado = calc.somar(1, 2);

        // propositalmente errado
        assertEquals(5, resultado);
    }
}
