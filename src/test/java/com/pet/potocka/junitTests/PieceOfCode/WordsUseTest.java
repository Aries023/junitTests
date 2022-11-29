package com.pet.potocka.junitTests.PieceOfCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsUseTest {

    @Test
    void anaTinaAlexTong(){
        var m = new WordsUse();
        assertEquals("Ana Tina Alex Tong", m.smash(new String[]{"Ana", "Tina", "Alex", "Tong"}));
    }

}