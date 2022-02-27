package com.sda.testing.solution.parametrized.romannumeral;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RomanNumeralConverterTest {

    public static Stream<Arguments> arabicToRomanTestData() {
        return Stream.of(
                Arguments.of(4999,"MMMMCMXCIX"),
                Arguments.of(3462,"MMMCDLXII")
        );
    };

    @ParameterizedTest
    @EnumSource
    void shouldUseRomanValuesFromEnum(RomanNumeralConverter.ArabicToRoman arabicToRoman) {
        String roman = RomanNumeralConverter.romanFor(arabicToRoman.getArabic());
        assertEquals(arabicToRoman.getRoman(), roman);
    }

    @ParameterizedTest
    @CsvSource({"4999, MMMMCMXCIX", "3462, MMMCDLXII","538, DXXXVIII" })
    public void dummy(int arabic, String expected) {
        String roman = RomanNumeralConverter.romanFor(arabic);
        assertEquals(expected, roman);
    }
/*
    @ParameterizedTest //sprawdz
    @CsvFileSource(resources= "/testdata/names.csv")
    public void dummy2(int arabic, String expected) {
        String roman = RomanNumeralConverter.romanFor(arabic);
        assertEquals(expected, roman);
    }*/

    @ParameterizedTest
    @MethodSource("arabicToRomanTestData") //alternatywa dla pliku csv
    public void shouldCalculateRomanValueForComplexNumberMethodSource(int arabic, String expected) {
        String roman = RomanNumeralConverter.romanFor(arabic);
        assertEquals(expected, roman);
    }
}