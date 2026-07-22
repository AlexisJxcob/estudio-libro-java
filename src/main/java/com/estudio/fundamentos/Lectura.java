package com.estudio.fundamentos;

import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) { // Punto de entrada del programa

        System.out.println("Seguiremos los estudios del libro pdf");

        Scanner entrada = new Scanner(System.in); // aca se crea el objeto Scanner con nombre de entrada

        System.out.println("Ingrese el primer numero:"); // Imprimimos un texto que pide los datos
        int obj1 = entrada.nextInt(); // Guardamos los datos en una variable

        System.out.println("Ingrese el segundo numero:");
        int obj2 = entrada.nextInt();

        int suma = obj1 + obj2;
        System.out.println("La suma es: " + suma);

        entrada.close();
    }
}