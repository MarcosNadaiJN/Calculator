package com.app.calculadora;

import java.util.ArrayList;

public class Functions {

    public static String concatArrayListToString (ArrayList<String> Digits){
        StringBuilder sb = new StringBuilder();
        for (String s : Digits)
        {
            sb.append(s);
        }
        return sb.toString();
    }

    public static Boolean DigitsAllowedSize (ArrayList<String> Digits) {
        return Digits.size() < 12;
    }

    public static Boolean DuplicatedSimbols (ArrayList<String> Digits) {
        if (       Digits.get(Digits.size() - 1).equals("+")
                || Digits.get(Digits.size() - 1).equals("-")
                || Digits.get(Digits.size() - 1).equals("/")
                || Digits.get(Digits.size() - 1).equals("*")
                || Digits.get(Digits.size() - 1).equals("%")) {
            return true;
        }
        return false;
    }
}
