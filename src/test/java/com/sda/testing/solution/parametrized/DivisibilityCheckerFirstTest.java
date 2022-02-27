package com.sda.testing.solution.parametrized;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DivisibilityCheckerFirstTest {

	@Test
	void shouldBeDivisibleBy3() {
		//given
		int i = 9;

		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);

		//then
		assertTrue(actual);
	}

	@Test
	void shouldNotBeDivisibleBy3() {
		//given
		int i = 4;
		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);
		//then
		assertFalse(actual);

	}

	@Test
	void shouldBeDivisibleBy3NegativeNumber() {
		//given
		int i = -6;
		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);
		//then
		assertTrue(actual);
	}

	@Test
	void shouldNotBeDivisibleBy3NegativeNumber() {
		//given
		int i = -4;
		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);
		//then
		assertFalse(actual);
	}

	@Test
	void zeroShouldBeDivisibleBy3() {
		//given
		int i = 0;
		//when
		boolean actual = DivisibilityChecker.isDivisibleBy3(i);
		//then
		assertTrue(actual);
	}
}