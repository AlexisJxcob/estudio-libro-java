public class Herencia {

  void main (){
    var animal = new Animal();
    Animal.eat();
  }

  public static class Animal {
    public static void eat(){
      System.out.println("El Animal esta comiendo");
    }
  }
}