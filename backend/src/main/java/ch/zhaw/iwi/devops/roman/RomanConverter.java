package ch.zhaw.iwi.devops.roman;

public class RomanConverter {

    String character = "III";

    public String convert(int i) {

        if (i > 1000)
            return "Numbers between 1-1000";
        else if (i < 1)
            return "Numbers between 1-1000";
        else if (i == 10)
            return "X";
        else if (i == 8)
            return "VIII";

        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder roman = new StringBuilder();

        for (int j = 0; j < values.length; j++) {
            while (i >= values[j]) {
                i -= values[j];
                roman.append(symbols[j]);
            }
        }

        return roman.toString();
    }

    public String getCharacter() {
        return character;
    }

}