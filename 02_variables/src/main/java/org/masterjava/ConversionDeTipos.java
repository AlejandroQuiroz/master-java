package org.masterjava;

public class ConversionDeTipos {
    public static void main(String[] args) {

        // Conversión de cadenas a primitivos

        String numStr = "50";

        int numInt = Integer.parseInt(numStr);
        System.out.println("numInt: " + numInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble: " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean: " + logicoBoolean);

        // Conversión de primitivos a cadenas

        int otroInt = 100;
        String otroNumStr = Integer.toString(otroInt);
        System.out.println("otroNumStr: " + otroNumStr);

        // Con sobrecarga de métod
        otroNumStr = String.valueOf(otroInt);
        System.out.println("otroNumStr: " + otroNumStr);

        Double otroNumDouble = 1234e2d;
        String otroNumReal = Double.toString(otroNumDouble);
        System.out.println("otroNumReal: " + otroNumReal);

        // Conversión de entre primitivos

        int i = 10000;
        short s = (short)i; // Casteo
        System.out.println("s: " + s);
        long l = i;
        System.out.println("l: " + l);

        char c = (char)i; // Casteo
        System.out.println("c: " + c);

        float f = (float)i; // Casteo
        System.out.println("f: " + f);

        double d = (double)i; // Casteo
        System.out.println("d: " + d);
    }
}
