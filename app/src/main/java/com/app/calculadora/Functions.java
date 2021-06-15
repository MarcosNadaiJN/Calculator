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
        return Digits.size() < 9;
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
//    public static String RemoveDoubleQuotes (ArrayList<String> Digits) {
//        String Equation = concatArrayListToString(Digits);
//
//        StringBuilder sb = new StringBuilder();
//
//        char[] tab = Equation.toCharArray();
//        for( char current : tab ){
//            if( current != '"' )
//                sb.append( current );
//        }
//
//        return sb.toString();
//    }

}
