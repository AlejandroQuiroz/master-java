package org.masterjava;

public class PrimitivosBoleanos {
    public static void main(String[] args) {

        // Boolean
        System.out.println("\n");
        System.out.println("--------------------------------------------------");
        System.out.println("Primitivos: Boleanos");
        System.out.println("--------------------------------------------------");

        boolean datoLogico = true;

        if (datoLogico) {
            System.out.println("El valor de datoLogico es (" + datoLogico + ")");
        }

        double num1 = 124e2d; // 12400.00
        float num2 = 30e-2f; // 0.30

        datoLogico = (num1 < num2);

        System.out.println("El valor de datoLogico es (" + datoLogico + ")");

    }
}
