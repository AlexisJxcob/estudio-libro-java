package com.estudios.poo;

public class Abstraction {

    public static void main(String[] args) {
        
        // var animalito = new Animal(); una clase abstracta no puede ser instanciada
        var doggy = new Dog();
        doggy.Sleep(); // si es una herencia si se puede instanciar
        
        var kitty = new Cat();
        kitty.Sleep();
    }

    // clase abstracta
    public static abstract class Animal { // se ocupa palabra reservada

        public void Sleep() {
            System.out.println("EL animal duerme");
        }
    }
    public static class Dog extends Animal {

        @Override
        public void Sleep() {
            System.out.println("El perro duerme");
        }
        
    }
    public static class Cat extends Animal {
        
    }

}
