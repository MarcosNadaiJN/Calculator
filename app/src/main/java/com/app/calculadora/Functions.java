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

    public static Integer concatArrayListToInteger (ArrayList<String> Digits){
        StringBuilder sb = new StringBuilder();
        for (String s : Digits)
        {
            sb.append(s);
        }
        return Integer.parseInt(sb.toString());
    }

    public static Boolean DigitsAllowedSize (ArrayList<String> Digits) {
        return Digits.size() < 8;
    }
}
