package com.company;

import junit.framework.TestCase;

public class ClassTest extends TestCase {

    Calculo calculo = new Calculo();

    public void test1ExecutaCalculo(){

        float valor1 = 10;
        float valor2 = 5;
        float valorEsperado = 15;

        float resultadoFeito = calculo.executaCalculo1(valor1, valor2);

        assertEquals(valorEsperado, resultadoFeito, 0);

    }

    public void test2ExecutaCalculo(){

        float valor1 = 10;
        float valor2 = 5;
        float valorEsperado = 5;

        float resultadoFeito = calculo.executaCalculo2(valor1, valor2);

        assertEquals(valorEsperado, resultadoFeito, 0);

    }

}
