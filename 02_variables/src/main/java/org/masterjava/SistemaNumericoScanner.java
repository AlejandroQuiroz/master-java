package org.masterjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumericoScanner {
    public static void main(String[] args) {

        // System.in -> obtiene datos de la consola
        // System.out -> imprime datos en la co

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número entero: ");
        //String numStr = scanner.nextLine();

        int numDecimal = 0;

        try {
            numDecimal = scanner.nextInt();
                    //Integer.parseInt(numStr);
        } catch (InputMismatchException e) {
            System.out.println("Error (" + e + "): debes ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String resultadoDec = "El número decimal introducido es: " + numDecimal;
        String resultadoBin = "En binario " + numDecimal + " es = " + Integer.toBinaryString(numDecimal);
        String resultadoOct = "En octal " + numDecimal + " es = " + Integer.toOctalString(numDecimal);
        String resultadoHex = "En hexadecimal " + numDecimal + " es = " + Integer.toHexString(numDecimal);

        String mensaje = resultadoDec;
        mensaje += "\n" + resultadoBin;
        mensaje += "\n" + resultadoOct;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);

    }
}
