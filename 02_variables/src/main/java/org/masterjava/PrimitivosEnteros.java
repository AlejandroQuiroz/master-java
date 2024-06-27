package org.masterjava;

public class PrimitivosEnteros {
    public static void main(String[] args) {

        // Las variables son entidades que contienen valores o datos
        // Hay 2 tipos de variables: primitivos y referencia

        /*
            Primitivos: contienen un solo valor e incluyen los tipos de datos
                enteros (int), flotante (float), caracter (char), boleanos (boolean), etc.

            Referencia: son los Array, Class e Interfaces
        * */

        System.out.println("--------------------------------------------------");
        System.out.println("Primera variable");
        System.out.println("--------------------------------------------------");
        // Tipo de dato - Nombre - Valor
        String mensaje = "Hola mundo";
        System.out.println("Mi mensaje es: " + mensaje.toUpperCase());

        // Enteros
        System.out.println("\n");
        System.out.println("--------------------------------------------------");
        System.out.println("Primitivos: Enteros");
        System.out.println("--------------------------------------------------");

        // byte - 1 byte, 8 bits, el entero más pequeño en Java
        // Acepta entre: -128 y 127

        byte numByte = 127;
        System.out.println("numByte: " + numByte);
        System.out.println("Tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);
        System.out.println("\n");

        // short - 2 bytes, 16 bits
        // Acepta entre: -32768 y 32767

        short numShort = 32767;
        System.out.println("numShort: " + numShort);
        System.out.println("Tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);
        System.out.println("\n");

        // int - 4 bytes, 32 bits
        // Acepta entre: -2147483648 y 2147483647

        int numInt = 2147483647;
        System.out.println("numInt: " + numInt);
        System.out.println("Tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);
        System.out.println("\n");

        // long - 8 bytes, 64 bits
        // Acepta entre: -9223372036854775808 y 9223372036854775807

        long numLong = 9223372036854775807L;
        System.out.println("numLong: " + numLong);
        System.out.println("Tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bits a: " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);
        System.out.println("\n");

        // Var
        System.out.println("\n");
        System.out.println("--------------------------------------------------");
        System.out.println("Var");
        System.out.println("--------------------------------------------------");

        var var1 = 15;
        var var2 = "15";

        System.out.println("El valor de var1 es: " + var1 + " y es de tipo int");
        System.out.println("El valor de var2 es: " + var2 + " y es de tipo String");
        System.out.println("\n");

    }
}