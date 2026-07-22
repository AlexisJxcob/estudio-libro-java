package com.estudios.estructuras;

import java.util.HashSet;
// set es desordenada
public class EstructuraSet {
    static void main() {
        // declaracion
        HashSet<String> names = new HashSet<>();

        // tamaño
        System.out.println(names.size());

        // añadir elementos
        names.add("Alexis");
        names.add("Jacob");
        names.add("Fernando");
        System.out.println(names.size());

        // remover elementos
        names.add("prueba");
        names.remove("prueba");
        System.out.println(names);

        // buscar elementos
        System.out.println(names.contains("Alexis")); // es mas rapido para buscar que el array
        System.out.println(names.contains("alexis"));

        // los sets no permiten repetidos
        names.add("Jacob");
        names.add("Jacob");
        names.add("Jacob");
        names.add("Jacob");
        System.out.println(names);

        // add all
        HashSet<String> countries = new HashSet<>();

        countries.add("Argentina");
        countries.add("Chile");
        countries.add("España");
        countries.add("Peru");

        names.addAll(countries);
        System.out.println(names);
    }
}
