package com.estudio.fundamentos;

public class Operadores {

    public static void main(String[] args) { // Punto de entrada del programa

        System.out.println("Seguiremos los estudios del libro pdf");

        // === Operadores aritmeticos ===
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a + b)); // suma
        System.out.println("a - b = " + (a - b)); // resta
        System.out.println("a * b = " + (a * b)); // multiplicación
        System.out.println("a / b = " + (a / b)); // división
        System.out.println("a % b = " + (a % b)); // resto

        // === Operadores relacionales ===
        System.out.println("a == b = " + (a == b)); // igualdad
        System.out.println("a != b = " + (a != b)); // desigualdad
        System.out.println("a > b = " + (a > b)); // mayor que
        System.out.println("a < b = " + (a < b)); // menor que
        System.out.println("a >= b = " + (a >= b)); // mayor o igual que
        System.out.println("a <= b = " + (a <= b)); // menor o igual que

        // === Operadores logicos ===

        // and = &&

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // or = ||

        System.out.println(true || true); // dead code significa que nunca se va a ejecutar
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // not = !

        System.out.println(!true);
        System.out.println(!false);
    }
}

