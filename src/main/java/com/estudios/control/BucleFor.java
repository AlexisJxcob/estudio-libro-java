package com.estudios.control;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BucleFor {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Numero: " + i);
        } // fin for

        String[] dias = {"LUN", "MAR", "MIE", "JUE", "VIE", "SAB", "DOM"};

        for (int i = 0; i < dias.length; i++) {
            System.out.println("indice numero: " + i + " es el dia de la semana: " + dias[i]);
        }

        // for each
        for (String name: dias) {
            System.out.println(name);
        }

        // para un set
        HashSet<String> countries = new HashSet<>();

        countries.add("Argentina");
        countries.add("Chile");
        countries.add("España");
        countries.add("Peru");

        for (String pais: countries) {
            System.out.println(pais);
        }

        // para un map
        HashMap<String, String> names = new HashMap<>();

        names.put("Nombre", "Alexis");
        names.put("Apellido", "Jacob");
        names.put("Sobrenombre", "Jhon");

        for (Map.Entry<String, String> claves: names.entrySet()) {
            System.out.println("clave + valor: " + claves);
            System.out.println("solo claves: " + claves.getKey());
            System.out.println("solo values: " + claves.getValue());
        }
    } // fin function
} // fin class
