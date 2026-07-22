package com.estudios.poo;

public class Polimorfismo {

    public static void main(String[] args) {

        var animal = new Animal();
        animal.Sound();

        var dog = new Dog();
        dog.Sound();

        // polimorfismo por sobrecarga
        var calculadora = new Calculator();
        System.out.println(calculadora.sumar(3, 6));
        System.out.println(calculadora.sumar(3.3, 6.6));
    }

    // poliformismo permite que distintos objetos respondan de forma diferente
    public static class Animal {

        public void Sound() {
            System.out.println("Hace un ruido");
        }
    }

    public static class Dog extends Animal {

        // polimorfismo por herencia
        @Override
        public void Sound() {
            System.out.println("El perro hace guau");
            // - super.Sound();  cambia el funcionamiento del padre
        }

    }

    // polimorfismo por sobrecarga
    public static class Calculator {

        public int sumar(int a, int b) {
            return a + b;
        }

        public double sumar(double a, double b) {
            return a + b;
        }
    }
}
