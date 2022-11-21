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
    void degree59Plus20IsC(){
        var calculator = new SimpleCalculator();
        assertEquals('C',calculator.degree(59+20));
    }

    @Test
    void degree50IsF(){
        var calculator = new SimpleCalculator();
        assertEquals('F',calculator.degree(50));
    }

    @Test
    void degree100IsA(){
        var calculator = new SimpleCalculator();
        assertEquals('A',calculator.degree(100));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        var calculator = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class, ()->
            calculator.degree(-1)
        );

    }

    @Test
    void moreThenOneHundredShouldReturnIllegalArgumentException(){
        var calculator = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class, () ->
            calculator.degree(101)
        );

    }
}