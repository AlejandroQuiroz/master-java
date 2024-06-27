package org.masterjava;

public class PrimitivosCaracteres {
    public static void main(String[] args) {

        // char - 2 bytes, 16 bits
        // Acepta entre: 4.9E-324 y 1.7976931348623157E308
        // UNICODE - Mapa de caracteres
        // https://symbl.cc/en/unicode-table/
        // https://en.wikipedia.org/wiki/List_of_Unicode_characters

        char caracter1 = 'A';
        char caracter2 = '0';
        char caracter3 = '\u0040';
        char decimal = 64;
        char caracter4 = '\u0394';
        char caracter5 = '\u9749';
        System.out.println("caracter1: " + caracter1);
        System.out.println("caracter2: " + caracter2);
        System.out.println("caracter3: " + caracter3);
        System.out.println("decimal: " + decimal);
        System.out.println("caracter3 == decimal: " + (caracter3 == decimal));
        System.out.println("caracter4: " + caracter4);
        System.out.println("caracter5: " + caracter5);
        System.out.println("Tipo caracter corresponde en bytes a: " + Character.BYTES);
        System.out.println("Tipo caracter corresponde en bits a: " + Character.SIZE);
        System.out.println("\n");

        // Caracteres especiales

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Ejemplo espacio: (" + espacio + ")");
        System.out.println("Ejemplo retroceso: (" + retroceso + ")");
        System.out.println("Ejemplo tabulador: (" + tabulador + ")");
        System.out.println("Ejemplo retroceso: (" + nuevaLinea + ")");
        System.out.println("Ejemplo retornoCarro: (" + retornoCarro + ")");
        System.out.println("\n");
        System.out.println("(" + System.getProperty("line.separator") + ")");
        System.out.println("(" + System.lineSeparator() + ")");

    }
}
