package com.estudio.fundamentos;

// El 'package' indica la carpeta donde está guardado este archivo.
// En Java, si un archivo está dentro de una carpeta (en este caso 'libro'),
// debes declarar obligatoriamente a qué paquete pertenece en la primera línea.
// package Libro;

public class MiClase { // // inicializamos la clase

    public static void main(String[] args) { // Punto de entrada del programa

        System.out.println("Seguiremos los estudios del libro pdf");

        // === secuencias de escape ===

        // \t Inserta un espacio de tabulación en el texto.
        System.out.println("Texto 1\tTexto 2");

        // \n Inserta un salto de línea en el texto.
        System.out.println("Texto 3\nTexto 4");

        // \r Inserta un retorno de carro en el texto.
        System.out.println("Texto 5\rTexto 6");

        // \" Inserta un carácter de doble comilla en el texto (").
        System.out.println("\"Texto 7\" Texto 8");

        // \\ Inserta un carácter de barra diagonal invertida (\)
        System.out.println("Texto 9\\ Texto 10");

    } // } fin del metodo main (AQUÍ se cierra el main, al final de todo)

} // // fin de la clase
