package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class DivisibilityCheckerTest {

    @ParameterizedTest(name = "run #{index} with [{arguments{]")// po kolei rozne wartosci
    @ValueSource(ints = {-3,-6,0,3,9,12,15,10,7}) //załatwia given
    void shouldBeDivisibleBy3(int number) {
        //when
        boolean actual = DivisibilityChecker.isDivisibleBy3(number);
        //then
        assertTrue(actual);
    }

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 37, -4, -8, -17})
	void shouldNotBeDivisibleBy3(int number) {
		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(number);

		//then
		assertFalse(actual);
	}


	@ParameterizedTest
	@CsvSource({"0, true", "1, false", "3, true", "-3, true", "-8, false"})
	void shouldCheckDivisibility(int number, boolean expected) {
		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(number);

		//then
		assertEquals(expected, actual);
	}

}