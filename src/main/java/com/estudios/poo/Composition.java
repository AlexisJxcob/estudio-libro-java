package com.estudios.poo;

public class Composition {

    public static void main(String[] args) {
        var car = new Car();
        car.engine.on();    }

    public static class Engine {

        public void on() {
            System.out.println("motor encendido");
        }
    }

    public static class Car {

        Engine engine = new Engine();

        public void on() {
            engine.on();
        }
    }
}
