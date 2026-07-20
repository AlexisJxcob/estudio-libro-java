public class Herencia {

  // 1. El método main corregido con su firma oficial de Java
  public static void main(String[] args) {
    
    // Ya no llamamos a Animal.eat() de forma estática. 
    // Creamos los objetos con sus tipos correctos (Dog y Cat)
    Dog dog = new Dog();
    dog.name = "Lupita";
    dog.eat(); // Imprimirá: El Animal con nombre Lupita esta comiendo

    Cat cat = new Cat();
    cat.name = "Michi";
    cat.eat(); // Imprimirá: El Animal con nombre Michi esta comiendo
  }

  public static class Animal {
    String name;
    
    // 2. Le quitamos el 'static' para que pueda usar la variable 'name' de cada objeto
    public void eat() {
      System.out.println("El Animal con nombre " + name + " esta comiendo");
    }
  }

  // Las subclases heredan correctamente los atributos y métodos de Animal
  public static class Dog extends Animal {
    @Override
    public void eat(){
      System.out.println("El perro con nombre " + name + " esta comiendo"); // secuencias modfica la acción de comer del perro 
    }
  }

  public static class Cat extends Animal {
    
  }
}
