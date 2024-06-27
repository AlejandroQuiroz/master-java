package org.masterjava;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numDecimal = 500;

        System.out.println("numDecimal es: " + numDecimal);
        System.out.println("numDecimal en binario de " + numDecimal + " es = " + Integer.toBinaryString(numDecimal));

        // Poner 0b antes del número para indicar el tipo binario
        int numBinario = 0b111110100;
        System.out.println("numBinario es: " + numBinario);

        System.out.println("Número octal de numBinario = " + Integer.toOctalString(numBinario));

        // Poner 0 antes del número para indicar el tipo octal
        int numOctal = 0764;
        System.out.println("numOctal es: " + numOctal);

        System.out.println("Número hexadecimal de numDecimal = " + Integer.toHexString(numDecimal));

        // Poner 0x antes del número para indicar el tipo hexadecimal
        int numHex = 0x1f4;
        System.out.println("numHex es: " + numHex);

    }
}
