package org.masterjava;

import javax.swing.*;

public class SistemaNumericoDialog {
    public static void main(String[] args) {

        String numStr = JOptionPane.showInputDialog(null,"Ingresa un número entero: ");

        int numDecimal = 0;

        try {
            numDecimal = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: debes ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String resultadoDec = "El número decimal introducido es: " + numDecimal;
        String resultadoBin = "En binario " + numDecimal + " es = " + Integer.toBinaryString(numDecimal);
        String resultadoOct = "En octal " + numDecimal + " es = " + Integer.toOctalString(numDecimal);
        String resultadoHex = "En hexadecimal " + numDecimal + " es = " + Integer.toHexString(numDecimal);

        System.out.println(resultadoDec);
        System.out.println(resultadoBin);
        System.out.println(resultadoOct);
        System.out.println(resultadoHex);

        String mensaje = resultadoDec;
        mensaje += "\n" + resultadoBin;
        mensaje += "\n" + resultadoOct;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
