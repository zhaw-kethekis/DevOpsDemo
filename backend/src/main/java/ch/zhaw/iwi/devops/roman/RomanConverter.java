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
        else if (i == 5)
            return "V";
        else if (i == 4)
            return "IV";
        else
            return "";
    }

    public String getCharacter() {
        return character;
    }

}