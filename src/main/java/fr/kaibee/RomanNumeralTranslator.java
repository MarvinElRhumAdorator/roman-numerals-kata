package fr.kaibee;

public class RomanNumeralTranslator {
    public String translate(int input) {
        String res = "";
        while (input >= 1000) {
            res += "M";
            input -= 1000;
        }
        if (input >= 900) {
            res += "CM";
            input -= 900;
        }

        if (input >= 500) {
            res += "D";
            input -= 500;
        }

        if (input >= 400) {
            res += "CD";
            input -= 400;
        }

        while (input >= 100) {
            res += "C";
            input -= 100;
        }

        if (input >= 50) {
            res += "L";
            input -= 50;
        }

        if (input >= 40) {
            res += "XL";
            input -= 40;
        }

        while (input >= 10) {
            res += "X";
            input -= 10;
        }

        if (input == 9) {
            res += "IX";
            input -= 9;
        }

        if (input >= 5) {
            res += "V";
            input -= 5;
        }
        if (input == 4) {
            res += "IV";
            input -= 4;
        }

        while (input >= 1) {
            res += "I";
            input -= 1;
        }

        return res;
    }

}
