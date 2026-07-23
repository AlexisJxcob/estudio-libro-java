package com.estudios.poo;

import java.util.List;

public class PolymorphismExercises {

    public static void main(String[] args) {
        List<Animal> animales = List.of(new Dog(), new Cat(), new Cow());
        
        for (Animal animal : animales) {
            animal.makeSound();
        }
    }

    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
    public static class Animal {

        public void makeSound() {
            System.out.println("Sonido");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Sonido del perro es guau");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Sonido del gato es miau");
        }
    }

    public static class Cow extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Sonido de la vaca es muu");
        }

    }
}

// 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.

public static class Shape{
    public double calculateArea(){
        return 0.0;
    }
}

public static class Circle{
    
}

public static class Rectangle {

}
// 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
// 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
// 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
// 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
// 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
// 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
// 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
// 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.

