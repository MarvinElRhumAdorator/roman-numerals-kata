package fr.kaibee;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralTranslator {
    public static final Map<String, Integer> ROMAN_LETTER_TO_NUMERIC_VALUES = new LinkedHashMap<>() {{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
    }};

    public String translate(int input) {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, Integer> romanLetterToNumeric : ROMAN_LETTER_TO_NUMERIC_VALUES.entrySet()) {
            input = updateTranslationAndReturnRemainingNumber(res, input,
                    romanLetterToNumeric.getKey(), romanLetterToNumeric.getValue());
        }
        return res.toString();
    }

    private static int updateTranslationAndReturnRemainingNumber(StringBuilder translation, int remainingNumber,
                                                                 String romanLetter, int romanLetterNumericValue) {
        while (remainingNumber >= romanLetterNumericValue) {
            translation.append(romanLetter);
            remainingNumber -= romanLetterNumericValue;
        }
        return remainingNumber;
    }

}
