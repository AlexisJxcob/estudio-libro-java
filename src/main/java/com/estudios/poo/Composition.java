package com.estudios.poo;

public class Composition {
    public static void main(String[] args) {
        var auto = new Car();
        auto.on();
    }
    
    public static class Engine {
        public void on(){
            System.out.println("motor encendido");
        }
    }
    
    public static class Car extends Engine {
        
    }
}