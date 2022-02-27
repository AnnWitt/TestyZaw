package com.sda.testing.solution.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldThrowArithmeticException(){
        assertThrows(ArithmeticException.class, ()->Calculator.divide(3,0));
        //clasa, executable
    }

}