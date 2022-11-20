package com.pet.potocka.junitTests.PieceOfCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShuldEqualsFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void treePlusSevenEqualsTeen(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(3,7));
    }

    @Test
    void degreeDIf50Plus20(){
        var calculator = new SimpleCalculator();
        assertEquals('C',calculator.degree(50+20));
    }

    @Test
    void degreeFIf50(){
        var calculator = new SimpleCalculator();
        assertEquals('F',calculator.degree(50));
    }

    @Test
    void degreeAFor100(){
        var calculator = new SimpleCalculator();
        assertEquals('A',calculator.degree(100));
    }
}