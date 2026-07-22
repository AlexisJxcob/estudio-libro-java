package com.estudios.estructuras;

public class Array {
    public static void main(String[] args) {
        String[ ] arrayString = new String[7]; // elementos del 0 al 6

        arrayString[0] = "Primer valor";
        System.out.println(arrayString[0]);

        int[] arrayInt = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Indice: " + i + ", valor: " + arrayInt[i]);
        }

        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] =  3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;

        for (int i = 0; i < 5; i++) {
            System.out.println("Indice: " + i + ", valor: " + arrayInt[i]);
        }

        // inicializar array con valores

        String[] dias = {"LUN", "MAR", "MIE", "JUE", "VIE"};

        for (int i = 0; i < dias.length; i++) {
            System.out.println("Indice: " + i + ", valor: " + dias[i]);
        }
    }
}