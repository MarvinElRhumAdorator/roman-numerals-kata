package fr.kaibee;

public class RomanNumeralTranslator {
    public String translate(int input) {
        String res = "";
        while (input >= 1000) {
            res += "M";
            input -= 1000;
        }
        if (input >= 500) {
            res += "D";
            input -= 500;
        }

        while (input >= 100) {
            res += "C";
            input -= 100;
        }

        if (input >= 50) {
            res += "L";
            input -= 50;
        }

        while (input >= 10) {
            res += "X";
            input -= 10;
        }

        if (input >= 5) {
            res += "V";
            input -= 5;
        }

        while (input >= 1) {
            res += "I";
            input -= 1;
        }

        return res;
    }

}
