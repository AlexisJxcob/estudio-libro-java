package com.estudios.poo;

public class Abstraction {

    public static void main(String[] args) {

        // var animalito = new Animal(); una clase abstracta no puede ser instanciada
        var doggy = new Dog();
        doggy.Sleep(); // si es una herencia si se puede instanciar
        doggy.Sound();

        var kitty = new Cat();
        kitty.Sleep();
        kitty.Sound();

        // - interface
        
        var batman = new Bat();
        batman.Sleep();
        batman.Sound();
        batman.fly();
        
        var ave = new Bird();
        ave.Sleep();
        ave.Sound();
        ave.fly();
    }

    // clase abstracta
    public static abstract class Animal { // se ocupa palabra reservada

        public void Sleep() {
            System.out.println("EL animal duerme");
        }

        public abstract void Sound();
    }

    public static class Dog extends Animal {

        @Override
        public void Sleep() {
            System.out.println("El perro duerme");
        }

        @Override
        public void Sound() {
            System.out.println("El perro hace Guau");
        }

    }

    public static class Cat extends Animal {

        @Override
        public void Sound() {
            System.out.println("EL gato hace miau");
        }

    }

    // - interface
    public interface Fliying {

        // no habra implementaciones
        void fly();
    }

    // estas 2 clases tienen 2 cosas similares
    public static class Bird extends Animal implements Fliying{

        @Override
        public void Sound() {
            System.out.println("EL ave hace pio pio");
        }

        @Override
        public void fly() {
            System.out.println("Vuela vuela");
        }

    }

    public static class Bat extends Animal implements Fliying{ // palabra reservada por interface

        @Override
        public void Sound() {
            System.out.println("EL ave hace iam batman");
        }

        @Override
        public void fly() {
            System.out.println("Volando bajo, Robin");
        }

    }
}
