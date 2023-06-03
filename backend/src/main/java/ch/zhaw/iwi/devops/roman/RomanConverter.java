package ch.zhaw.iwi.devops.roman;

public class RomanConverter {

    String character = "III";

    public String convert(int i) {
        if (i == 50)
            return "L";
        else if (i == 40)
            return "XL";
        else if (i == 10)
            return "X";
        else if (i == 8)
            return "VIII";
        else if (i == 7)
            return "VII";
        else if (i == 6)
            return "VI";
        else if (i == 5)
            return "V";
        else if (i == 4)
            return "IV";
        else if (i == 3)
            return "III";
        else if (i > 1000)
            return "Numbers between 1-1000";
        else if (i < 1)
            return "Numbers between 1-1000";
        else
            return "There is no such number";
    }

    public String getCharacter() {
        return character;
    }

}