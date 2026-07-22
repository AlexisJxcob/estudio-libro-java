package com.estudios.poo;

public class Person {

    // Atributos privados (Encapsulación)
    private final String name; // final: no se puede modificar después de crearse
    private int age;
    private final String dni;  // final: dato sensible que no debe cambiar

    // Constructor: mecanismo de inicialización
    public Person(String name, int age, String dni) {
        this.name = name; // 'this.name' es el atributo de arriba, 'name' es el parámetro que entra
        this.setAge(age); // Usamos el setter para aplicar la validación de edad desde el inicio
        this.dni = dni;
    }

    // Métodos (Comportamiento)
    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años. Mi DNI es: " + dni);
    }

    // Getters: permiten acceder a los datos de forma segura
    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters: permiten actualizar la información con reglas
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
