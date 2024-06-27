package org.masterjava;

public class PrimitivosFlotantes {
    public static void main(String[] args) {

        // float - 4 bytes, 32 bits
        // Acepta entre: 1.4E-45 y 3.4028235E38
        // 1.4 × 10^-45 = 0.0000000000000000000000000000000000000000000014
        // 3.4028235 × 10^+38 = 340282350000000000000000000000000000000.0
        // https://coolconversion.com/math/scientific-notation-to-decimal/

        float numFloat = 1.0f;
        System.out.println("numFloat: " + numFloat);
        System.out.println("Tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);
        System.out.println("\n");

        float numF1 = 2.12e3f; // -> 2120
        System.out.println(" El valor de numF1 es: " + numF1);
        System.out.println("\n");

        // double - 8 bytes, 64 bits
        // Acepta entre: 4.9E-324 y 1.7976931348623157E308
        // 4.9 × 10^-324 = 0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000049
        // 1.7976931348623157 × 10^+308 = 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0
        // https://coolconversion.com/math/scientific-notation-to-decimal/

        double numDouble = 1.0d;
        System.out.println("numDouble: " + numDouble);
        System.out.println("Tipo double corresponde en bytes a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);
        System.out.println("\n");

    }
}
