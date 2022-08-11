import fr.kaibee.RomanNumeralTranslator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralTranslatorTest {

    private RomanNumeralTranslator translator = new RomanNumeralTranslator();

    @ParameterizedTest
    @CsvSource({
            "1000, M",
            "2000, MM",
            "1500, MD",
            "1600, MDC",
            "500, D",
            "700, DCC",
            "1750, MDCCL",
            "1760, MDCCLX",
            "1770, MDCCLXX",
            "1775, MDCCLXXV",
            "1776, MDCCLXXVI",
            "1777, MDCCLXXVII",
            "900, CM",
            "400, CD",
            "40, XL",
            "9, IX",
            "4, IV",
    })
    void should_translate_number_to_roman_literal(int input, String expectedRomanNumeral) {
        assertThat(translator.translate(input)).isEqualTo(expectedRomanNumeral);


    }


}
