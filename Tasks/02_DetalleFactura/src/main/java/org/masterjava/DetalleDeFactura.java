package org.masterjava;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        // Desarrollado por Alejandro Quiroz

        Scanner scan = new Scanner(System.in);

        double impuesto = 0.19;
        double precioProducto1 = 0d;
        double precioProducto2 = 0d;
        double sumaProductos = 0d;
        double totalBruto = 0d;
        double totalNeto = 0d;

        System.out.println("Indica el nombre de la factura o su descripción: ");
        String facturaNombre = scan.nextLine();

        try {
            System.out.println("Indica el precio del primer producto: ");
            precioProducto1 = scan.nextDouble();

            System.out.println("Indica el precio del segundo producto: ");
            precioProducto2 = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Error (" + e + "): el precio del producto no es válido, intenta de nuevo...");
            main(args);
            System.exit(0);
        }

        sumaProductos = precioProducto1 + precioProducto2;
        totalBruto = (sumaProductos) * impuesto;
        totalNeto = sumaProductos + totalBruto;

        String mensaje = "La factura " + facturaNombre + " tiene un total bruto de $" + sumaProductos + ", con un impuesto de $" + totalBruto + " y el monto después de impuesto es de $" + totalNeto;

        System.out.println(mensaje);

        // precioProducto1 = 10
        // precioProducto2 = 20

        // sumaProductos = 30
        // totalBruto = 5.7
        // totalNeto = 35.7

    }
}