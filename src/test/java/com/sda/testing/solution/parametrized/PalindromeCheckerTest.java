package com.sda.testing.solution.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @ParameterizedTest
    @CsvSource({"słowo,false","anna,true","inne,false","kobyła ma mały bok,true","kamil ślimak,true"})
    void isPalidromeTrueCsv(String string, boolean expected){
        //when
        boolean actual=PalindromeChecker.isPalindrome(string);
        //then
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources= "/testdata/palidroms.csv")
    void isPalidromeTrueCsvSource(String string, boolean expected){
        //when
        boolean actual=PalindromeChecker.isPalindrome(string);
        //then
        assertEquals(expected,actual);
    }

	@ParameterizedTest
	@CsvFileSource(resources = "/testdata/palindroms.csv")
	void shouldCheckWhetherStringIsAPalindromeFile(String text, boolean expected) {
		//when
		boolean actual = PalindromeChecker.isPalindrome(text);

		//then
		assertEquals(expected, actual);
	}

}