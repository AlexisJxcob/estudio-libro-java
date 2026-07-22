package com.estudio.fundamentos;

public class Variables {

    public static void main(String[] args) {

        // Variables de tipo entero
        byte byteDato = 100;
        short shortDato = 1000;
        int intDato = 1000000;
        long longDato = 1000000000000L; // La 'L' es necesaria para tipos long grandes

        // Variables de tipo flotante / decimal
        float floatDato = 100.25f; // La 'f' es obligatoria en los float
        double doubleDato = 2000.35;

        // Variables de tipo booleano y carácter
        boolean booleanDato = true;
        char charDato = '\u0040'; // Esto representa el símbolo '@' en Unicode

        // Impresión de datos en consola (usando comillas rectas "" estándar)
        System.out.print("Dato byte: ");
        System.out.println(byteDato);

        System.out.print("Dato short: ");
        System.out.println(shortDato);

        System.out.print("Dato int: ");
        System.out.println(intDato);

        System.out.print("Dato long: ");
        System.out.println(longDato);

        System.out.print("Dato float: ");
        System.out.println(floatDato);

        System.out.print("Dato double: ");
        System.out.println(doubleDato);

        System.out.print("Dato boolean: ");
        System.out.println(booleanDato);

        System.out.print("Dato char: ");
        System.out.println(charDato);
            
        // se agrego luego de java la palabra reserva 'var'
        
        // el tipo de dato es inferido 
        var edad = 17;
        System.out.println(edad);
    }
}